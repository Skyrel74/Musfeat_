package com.example.musfeat.ui.SignIn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.musfeat.R;
import com.example.musfeat.mvp.Presenter.SignInPresenter;
import com.example.musfeat.mvp.View.SignInView;
import com.example.musfeat.ui.BaseActivity;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;

public class SignInActivity extends BaseActivity implements SignInView {


    @InjectPresenter
    SignInPresenter signInPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
}