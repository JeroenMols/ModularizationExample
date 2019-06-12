package modularization.features.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_social.*
import modularization.libraries.actions.Actions

class SocialFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_social, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button_social_twitter.setOnClickListener(::openShareFeature)
        button_social_facebook.setOnClickListener(::openShareFeature)
        button_social_email.setOnClickListener(::openShareFeature)
    }

    private fun openShareFeature(view: View) {
        startActivity(Actions.openSharingIntent(context!!))
    }
}