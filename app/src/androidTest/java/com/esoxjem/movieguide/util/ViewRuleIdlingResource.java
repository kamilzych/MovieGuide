package com.esoxjem.movieguide.util;


import android.support.test.espresso.IdlingResource;
import android.view.View;

public class ViewRuleIdlingResource<T extends View> implements IdlingResource {

    public interface Rule<T> {
        boolean waitFor(T view);
    }

    private IdlingResource.ResourceCallback resourceCallback;
    private final T view;
    private final Rule<T> idlingRule;

    public ViewRuleIdlingResource(T targetView, Rule<T> rule) {
        this.view = targetView;
        this.idlingRule = rule;
    }

    @Override
    public String getName() {
        return ViewRuleIdlingResource.class.getSimpleName();
    }

    @Override
    public boolean isIdleNow() {
        boolean idle = !idlingRule.waitFor(view);
        if (idle && resourceCallback != null) {
            resourceCallback.onTransitionToIdle();
        }
        return idle;
    }

    @Override
    public void registerIdleTransitionCallback(IdlingResource.ResourceCallback resourceCallback) {
        this.resourceCallback = resourceCallback;
    }
}
