package rachman.forniandi.navofthronesapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_rhaegar.*
import rachman.forniandi.navofthronesapp.R


class RhaegarFragment : Fragment() {
    companion object{
        fun newInstance() = RhaegarFragment
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rhaegar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_rhaegar.setOnClickListener {
            view?.let {
                /*if (it != null) {
                    Navigation.findNavController(it).navigate(R.id.jonSnowFragment)
                }*/
                val action = RhaegarFragmentDirections.actionRhaegarFragmentToJonSnowFragment(whoami = (getString(R.string.prince)))
                Navigation.findNavController(it).navigate(action)
            }
        }
    }

}