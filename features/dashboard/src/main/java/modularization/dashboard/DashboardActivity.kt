package modularization.dashboard

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import modularization.dashboard.R.layout
import modularization.libraries.actions.Actions.openSharingIntent

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_dashboard)

        findViewById<BottomNavigationView>(R.id.bottomNavigation).setOnNavigationItemSelectedListener(
            object : BottomNavigationView.OnNavigationItemSelectedListener {
                override fun onNavigationItemSelected(@NonNull item: MenuItem): Boolean {
                    when (item.getItemId()) {
                        R.id.action_photos -> {
                            Toast.makeText(this@DashboardActivity, "Open photos tab", Toast.LENGTH_SHORT).show()
                        }
                        R.id.action_albums -> {
                            Toast.makeText(this@DashboardActivity, "Open albums tab", Toast.LENGTH_SHORT).show()
                        }
                        R.id.action_sharing -> {
                            startActivity(openSharingIntent(this@DashboardActivity))
                        }
                    }
                    return false
                }
            })
    }
}
