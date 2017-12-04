package com.esoxjem.movieguide.listing.sorting;

import com.esoxjem.movieguide.RxSchedulerRule;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author arunsasidharan
 */
@RunWith(MockitoJUnitRunner.class)
public class SortingDialogPresenterImplTest {
    @Rule
    public RxSchedulerRule rule = new RxSchedulerRule();
    @Mock
    private SortingDialogInteractor interactor;
    @Mock
    private SortingDialogView view;

    private SortingDialogPresenterImpl presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new SortingDialogPresenterImpl(interactor);
        presenter.setView(view);
    }

    @Test
    public void onPopularMoviesSelected() throws Exception {
        // when presenter's onPopularMoviesSelected() called,
        // then interactor.setSortingOption called with matching parameter
        Assert.fail("not implemented");
    }
}
