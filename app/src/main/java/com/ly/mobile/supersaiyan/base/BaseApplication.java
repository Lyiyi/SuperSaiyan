package com.ly.mobile.supersaiyan.base;

import android.app.Application;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.ly.mobile.supersaiyan.model.ottobean.DialogMessgeBean;
import com.squareup.otto.Subscribe;

/**
 * Created by apple on 2017/12/2.
 */

public class BaseApplication extends Application {
    private static final String TAG = "BaseApplication";

    @Override
    public void onCreate() {
        super.onCreate();
    }


}
