package com.esoxjem.movieguide.robolectric;

import android.content.Intent;
import android.os.Bundle;

import com.esoxjem.movieguide.Constants;
import com.esoxjem.movieguide.Movie;
import com.esoxjem.movieguide.details.MovieDetailsActivity;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;

@RunWith(RobolectricTestRunner.class)
public class RlMovieDetailsActivityTest {

    private ActivityController<MovieDetailsActivity> activityController;

    @Before
    public void setUp() throws Exception {
        activityController = Robolectric.buildActivity(
                MovieDetailsActivity.class, buildIntent(new Movie()));
    }

    @Test
    public void shouldShowMovieDetails() throws Exception {
        // view with id movie_name should match Movie::title
        Assert.fail("not implemented");
    }

    private static Intent buildIntent(Movie movie) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Bundle extras = new Bundle();
        extras.putParcelable(Constants.MOVIE, movie);
        intent.putExtras(extras);
        return intent;
    }
}
