package com.example.musfeat.ui.Main;

import android.os.Bundle;

import com.example.musfeat.R;
import com.example.musfeat.mvp.Presenter.MainPresenter;
import com.example.musfeat.mvp.View.MainView;
import com.example.musfeat.ui.BaseActivity;

import moxy.presenter.InjectPresenter;

public class MainActivity extends BaseActivity implements MainView {

    @InjectPresenter
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}