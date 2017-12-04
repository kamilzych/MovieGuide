package com.esoxjem.movieguide;

import com.esoxjem.movieguide.listing.MoviesListingActivityTest;
import com.esoxjem.movieguide.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        NetworkModule.class})
public interface TestComponent {

    void inject(MoviesListingActivityTest test);

}
