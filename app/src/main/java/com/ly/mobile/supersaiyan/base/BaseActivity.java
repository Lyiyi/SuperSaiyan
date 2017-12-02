package com.ly.mobile.supersaiyan.base;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Toast;

import com.ly.mobile.supersaiyan.model.ottobean.DialogMessgeBean;
import com.squareup.otto.Subscribe;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by apple on 2017/12/2.
 */

public class BaseActivity extends AppCompatActivity implements View.OnTouchListener{

    private String TAG="BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    protected void setOnTouche(View view){
        view.setOnTouchListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");
        AppBus.getInstance().register(this);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        AppBus.getInstance().unregister(this);
        EventBus.getDefault().unregister(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("action_down", "onTouch: ");
                ObjectAnimator upAnim = ObjectAnimator.ofFloat(view, "translationZ", 16);
                upAnim.setDuration(150);
                upAnim.setInterpolator(new DecelerateInterpolator());
                upAnim.start();
                break;

            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                Log.i("action_cancel", "onTouch: ");
                ObjectAnimator downAnim = ObjectAnimator.ofFloat(view, "translationZ", 0);
                downAnim.setDuration(150);
                downAnim.setInterpolator(new AccelerateInterpolator());
                downAnim.start();
                break;
        }
        return false;
    }

    @Subscribe
    public void OttodialogMessage(String string){

        Log.e("333",string);
        Toast.makeText(getApplicationContext(),"123",Toast.LENGTH_SHORT).show();

//        showDialog(dialogMessgeBean.getMessage());
    }

    @org.greenrobot.eventbus.Subscribe(threadMode =ThreadMode.MAIN )
    public void eventBusMessage(String string){
        Log.e("444", "eventBusMessage: "+string );
        showDialog(string);
    }


    public void showDialog(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }




}
