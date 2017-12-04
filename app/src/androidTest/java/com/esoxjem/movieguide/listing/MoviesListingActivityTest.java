package com.esoxjem.movieguide.listing;

import android.support.test.espresso.IdlingResource;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.esoxjem.movieguide.DaggerTestComponent;
import com.esoxjem.movieguide.TestComponent;
import com.esoxjem.movieguide.network.NetworkModule;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import okhttp3.OkHttpClient;

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
        final TestComponent testComponent = DaggerTestComponent.builder()
                .networkModule(new NetworkModule())
                .build();
        testComponent.inject(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldBeAbleToLaunchMainScreen() {
        // view with id "toolbar" and "action_sort" are visible
        Assert.fail("not implemented");
    }

    @Test
    public void shouldBeAbleToLoadMovies() throws InterruptedException {
        Thread.sleep(1000);
        // view with id "movies_listing" is visible
        Assert.fail("not implemented");
    }

    @Test
    public void shouldBeAbleToScrollViewMovieDetails() throws InterruptedException {
        Thread.sleep(1000);
        // perform click on one of the items in .movies_listing, verify view with "Summary" is shown
        Assert.fail("not implemented");
    }
}
