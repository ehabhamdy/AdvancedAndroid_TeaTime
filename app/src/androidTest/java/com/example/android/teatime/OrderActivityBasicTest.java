package com.example.android.teatime;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ehabhamdy on 4/27/17.
 */


@RunWith(AndroidJUnit4.class) // class to control launching the app as well as running ui tests on it
public class OrderActivityBasicTest {
    @Rule public ActivityTestRule<OrderActivity> mActivityTestRule
            = new ActivityTestRule<OrderActivity>(OrderActivity.class);

    @Test
    public void clickIncrementButton_ChangesQualityAndCost(){
        //1. Find the view
        //2. Perform action on the view
        Espresso.onView(withId(R.id.increment_button)).perform(ViewActions.click());
        //3. Check if the view does what you expect
        Espresso.onView(withId(R.id.quantity_text_view)).check(ViewAssertions.matches(withText("1")));
        Espresso.onView(withId(R.id.cost_text_view)).check(ViewAssertions.matches(withText("$5.00")));

    }
}
