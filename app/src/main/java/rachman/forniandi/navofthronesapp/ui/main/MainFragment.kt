package rachman.forniandi.navofthronesapp.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_lyanna.*
import kotlinx.android.synthetic.main.main_fragment.*
import rachman.forniandi.navofthronesapp.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        starkButton.setOnClickListener {
            view.let {
                it?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.lyannaFragment) }
            }
        }

        targaryenButton.setOnClickListener {
            view.let {
                it?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.rhaegarFragment) }
            }
        }

    }

}