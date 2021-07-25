package rachman.forniandi.navofthronesapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_jon_snow.*
import rachman.forniandi.navofthronesapp.R

class JonSnowFragment : Fragment() {

    companion object {
        fun newInstance() = JonSnowFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_jon_snow, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val safeArgs = JonSnowFragmentArgs.fromBundle(it)
            txtJonSnow.text = safeArgs.whoami
        }

    }


}