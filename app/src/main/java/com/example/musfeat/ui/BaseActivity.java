package com.example.musfeat.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;

import com.example.musfeat.mvp.BaseView;

import moxy.MvpAppCompatActivity;

public abstract class BaseActivity extends MvpAppCompatActivity implements BaseView {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }


    /** Метод возвращения на предыдущую активность/выход из приложения. Нужно переопределять
      для некоторых Активностей. */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    /** Метод для проверки интернета, переопределять в других активностях не надо. */
    @Override
    public void checkInternetConnection() {
        //TODO
    }
}
