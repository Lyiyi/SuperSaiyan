package com.ly.mobile.supersaiyan.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ly.mobile.supersaiyan.model.ottobean.DialogMessgeBean;
import com.squareup.otto.Produce;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by apple on 2017/12/2.
 */

public class BaseFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        OttoProvider.getInstance().register(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    protected void showDialog(String message){
        Log.e("222", "showDialog: " );

        AppBus.getInstance().post("123");
        EventBus.getDefault().post("123");


    }

}
