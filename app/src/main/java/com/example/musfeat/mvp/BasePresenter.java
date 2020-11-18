package com.example.musfeat.mvp;


import android.view.View;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import moxy.MvpView;

@InjectViewState
public abstract class BasePresenter<View extends MvpView> extends MvpPresenter<BaseView> {


}
