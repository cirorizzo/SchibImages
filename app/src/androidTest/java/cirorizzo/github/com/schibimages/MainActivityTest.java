package cirorizzo.github.com.schibimages;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import cirorizzo.github.com.schibimages.view.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
            MainActivity.class, true, true);

    @Test
    public void testOne() {
        onView(withId(R.id.data_recycler_view)).check(matches(isDisplayed()));
    }
}




