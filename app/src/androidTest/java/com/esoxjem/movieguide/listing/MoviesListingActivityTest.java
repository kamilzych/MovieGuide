package com.esoxjem.movieguide.listing;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.esoxjem.movieguide.DaggerTestComponent;
import com.esoxjem.movieguide.R;
import com.esoxjem.movieguide.TestComponent;
import com.esoxjem.movieguide.network.NetworkModule;
import com.jakewharton.espresso.OkHttp3IdlingResource;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author arunsasidharan
 */
@RunWith(AndroidJUnit4.class)
public class MoviesListingActivityTest {

    @Rule
    public final ActivityTestRule<MoviesListingActivity> activityTestRule = new ActivityTestRule<>(MoviesListingActivity.class);

    @Inject
    OkHttpClient okHttpClient;

    private IdlingResource okHttpIdlingResource;

    @Before
    public void setUp() {
        //
        final TestComponent testComponent = DaggerTestComponent.builder()
                .networkModule(new NetworkModule())
                .build();
        testComponent.inject(this);
        //
        okHttpIdlingResource = OkHttp3IdlingResource.create("okhttp", okHttpClient);
        Espresso.registerIdlingResources(okHttpIdlingResource);
    }

    @After
    public void tearDown() throws Exception {
        Espresso.unregisterIdlingResources(okHttpIdlingResource);
    }

    @Test
    public void shouldBeAbleToLaunchMainScreen() {
        // view with id "toolbar" and "action_sort" are visible
        onView(withId(R.id.toolbar)).check(matches(isDisplayed()));
        onView(withId(R.id.action_sort)).check(matches(isDisplayed()));
    }

    @Test
    public void shouldBeAbleToLoadMovies() throws InterruptedException {
        Thread.sleep(1000);
        // view with id "movies_listing" is visible
        onView(withId(R.id.movies_listing)).check(matches(isDisplayed()));
    }

    @Test
    public void shouldBeAbleToScrollViewMovieDetails() throws InterruptedException {
        Thread.sleep(1000);
        // perform click on one of the items in .movies_listing, verify view with "Summary" is shown
        onView(withId(R.id.movies_listing)).perform(RecyclerViewActions.actionOnItemAtPosition(10, click()));
        onView(withText("Summary")).check(matches(isDisplayed()));
    }
}
