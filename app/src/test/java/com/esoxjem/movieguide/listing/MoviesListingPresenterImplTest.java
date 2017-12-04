package com.esoxjem.movieguide.listing;

import com.esoxjem.movieguide.Movie;
import com.esoxjem.movieguide.RxSchedulerRule;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

/**
 * @author arunsasidharan
 */
@RunWith(MockitoJUnitRunner.class)
public class MoviesListingPresenterImplTest {
    @Rule
    public RxSchedulerRule rule = new RxSchedulerRule();
    @Mock
    private MoviesListingInteractor interactor;
    @Mock
    private MoviesListingView view;
    @Mock
    private List<Movie> movies;

    private MoviesListingPresenterImpl presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new MoviesListingPresenterImpl(interactor);
    }

    @After
    public void teardown() {
        presenter.destroy();
    }

    @Test
    public void shouldBeAbleToDisplayMovies() {
        // when presenter's setView called,
        // then view.showMovies called with movies provided by interactor
        Assert.fail("not implemented");
    }
}
