package com.esoxjem.movieguide.details;

import com.esoxjem.movieguide.Movie;
import com.esoxjem.movieguide.Review;
import com.esoxjem.movieguide.RxSchedulerRule;
import com.esoxjem.movieguide.Video;
import com.esoxjem.movieguide.favorites.FavoritesInteractor;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

/**
 * @author arunsasidharan
 */
@RunWith(MockitoJUnitRunner.class)
public class MovieDetailsPresenterImplTest {
    @Rule
    public RxSchedulerRule rule = new RxSchedulerRule();
    @Mock
    private MovieDetailsView view;
    @Mock
    private MovieDetailsInteractor movieDetailsInteractor;
    @Mock
    private FavoritesInteractor favoritesInteractor;
    @Mock
    List<Video> videos;
    @Mock
    Movie movie;
    @Mock
    List<Review> reviews;

    private MovieDetailsPresenterImpl movieDetailsPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        movieDetailsPresenter = new MovieDetailsPresenterImpl(movieDetailsInteractor, favoritesInteractor);
        movieDetailsPresenter.setView(view);
    }

    @After
    public void teardown() {
        movieDetailsPresenter.destroy();
    }

    @Test
    public void shouldUnfavoriteIfFavoriteTapped() {
        // if the movie is favorited, and presenter's onFavoriteClick() called
        // then view showUnFavorited called
        Assert.fail("not implemented");
    }

    @Test
    public void shouldFavoriteIfUnfavoriteTapped() {
        // if the movie is NOT favorited, and presenter's onFavoriteClick() called
        // then view showFavorited called
        Assert.fail("not implemented");
    }

    @Test
    public void shouldBeAbleToShowTrailers() {
        // if the movie has video trailers, and presenter's showTrailers() called
        // then view showTrailers called
        Assert.fail("not implemented");
    }

    @Test
    public void shouldFailSilentlyWhenNoTrailers() throws Exception {
        // if the movie has error while loading video trailers, and presenter's showTrailers() called
        // then no view interactions happened
        Assert.fail("not implemented");
    }

    @Test
    public void shouldBeAbleToShowReviews() {
        // if the movie has error while loading video trailers, and presenter's showReviews() called
        // then view showReviews called
        Assert.fail("not implemented");
    }
}
