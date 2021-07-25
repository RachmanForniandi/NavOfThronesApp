package rachman.forniandi.navofthronesapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_lyanna.*
import rachman.forniandi.navofthronesapp.R


class LyannaFragment : Fragment() {
    companion object{
        fun newInstance() = LyannaFragment
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lyanna, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_lyanna.setOnClickListener {
            view?.let {
                val action = LyannaFragmentDirections.actionLyannaFragmentToJonSnowFragment(whoami = (getString(R.string.jon_snow)))

                Navigation.findNavController(it).navigate(action)
            }
        }
    }

}