package cc.somkiat.dtaccalculator;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    @Test public void
    add_1_and_1_should_result_2() {
        onView(withId(R.id.input1))
                .perform(
                        typeText("1"),
                        closeSoftKeyboard()
                );
        onView(withId(R.id.input2))
                .perform(
                        typeText("1"),
                        closeSoftKeyboard()
                );
        onView(withId(R.id.addButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("2")));
    }

    @Test public void
    minus_1_and_1_should_result_0() {
        onView(withId(R.id.input1))
                .perform(replaceText("1"));
        onView(withId(R.id.input2))
                .perform(typeText("1"));
        onView(withId(R.id.minusButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("0")));
    }

}