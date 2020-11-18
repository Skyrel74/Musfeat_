package com.example.musfeat.mvp;

import moxy.MvpView;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface BaseView extends MvpView {

    @StateStrategyType(SkipStrategy.class)
    void checkInternetConnection();
}
