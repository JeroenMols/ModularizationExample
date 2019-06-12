package com.jeroenmols.modularization.example;

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class AppFlowTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun test_criticalUserFlow_throughoutEntireApp() {
        onView(withId(R.id.button_login_start)).perform(click())
        onView(withId(R.id.button_login_signin)).perform(click())
        onView(withId(R.id.button_login_toapp)).perform(click())

        onView(withId(R.id.action_albums)).perform(click())
        onView(withId(R.id.action_sharing)).perform(click())
        onView(withId(R.id.button_social_facebook)).perform(click())

        onView(withId(R.id.recyclerView_sharing_contacts)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}
