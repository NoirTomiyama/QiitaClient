package com.noir.qiitaclient

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.hamcrest.Matcher
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

  @JvmField
  @Rule
  val activityTestRule = ActivityTestRule(MainActivity::class.java)

  @Test
  fun 各ビューが表示されていること_ただしプログレスバーは非表示() {
    onView(withId(R.id.list_view)).check(matches(isDisplayed()))
    onView(withId(R.id.query_edit_text)).check(matches(isDisplayed()))
    onView(withId(R.id.search_button)).check(matches(isDisplayed()))

    onView(withId(R.id.progress_bar)).check(matches(isNotDisplayed()))
  }

  fun isNotDisplayed(): Matcher<View> = not(isDisplayed())
}