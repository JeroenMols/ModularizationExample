package modularization.libraries.actions

import android.content.Intent

object Actions {

    fun openLoginIntent() = Intent("com.jeroenmols.modularization.login.open")
    fun openDashboardIntent() = Intent("com.jeroenmols.modularization.dashboard.open")
}
