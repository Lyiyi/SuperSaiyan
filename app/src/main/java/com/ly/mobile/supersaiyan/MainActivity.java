package com.ly.mobile.supersaiyan;



import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ly.mobile.supersaiyan.base.BaseActivity;
import com.ly.mobile.supersaiyan.base.OttoProvider;
import com.ly.mobile.supersaiyan.model.ottobean.DialogMessgeBean;
import com.ly.mobile.supersaiyan.view.fragment.OneFragment;
import com.squareup.otto.Produce;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;


public class MainActivity extends BaseActivity {

    private String TAG="MainActivity";
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;



    @BindView(R.id.framelayout)
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,new OneFragment());
        fragmentTransaction.commit();

    }





}
