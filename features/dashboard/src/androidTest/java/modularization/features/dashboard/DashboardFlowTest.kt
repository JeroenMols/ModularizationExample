package modularization.features.dashboard

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class DashboardFlowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(DashboardActivity::class.java)

    @Test
    fun dashboardFlowTest() {

        onView(withId(R.id.action_albums)).perform(click())
        onView(withId(R.id.action_sharing)).perform(click())

        onView(withId(R.id.button_social_facebook)).check(matches(isDisplayed()))
    }
}
