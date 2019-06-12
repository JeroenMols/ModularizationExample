package modularization.features.login

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class LoginFlowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun loginFlowTest() {
        onView(withId(R.id.button_login_start)).perform(click())
        onView(withId(R.id.button_login_signin)).perform(click())

        onView(withId(R.id.button_login_toapp)).check(matches(isDisplayed()))
    }
}
