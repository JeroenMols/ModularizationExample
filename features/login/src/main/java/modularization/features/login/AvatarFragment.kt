package modularization.features.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import modularization.libraries.actions.Actions

class AvatarFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_avatar, container, false)
        view.findViewById<Button>(R.id.button_login_toapp).setOnClickListener {
            activity!!.startActivity(Actions.openDashboardIntent(context!!, "fakeuser"))
        }
        return view
    }
}