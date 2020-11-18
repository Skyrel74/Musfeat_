package com.example.musfeat.ui.Splash;

import android.os.Bundle;

import com.example.musfeat.R;
import com.example.musfeat.mvp.Presenter.SplashPresenter;
import com.example.musfeat.mvp.View.SplashView;
import com.example.musfeat.ui.BaseActivity;

import moxy.presenter.InjectPresenter;


public class SplashActivity extends BaseActivity implements SplashView {

    @InjectPresenter
    SplashPresenter splashPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


}