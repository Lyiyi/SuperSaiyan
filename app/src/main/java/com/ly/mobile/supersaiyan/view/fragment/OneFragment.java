package com.ly.mobile.supersaiyan.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ly.mobile.supersaiyan.R;
import com.ly.mobile.supersaiyan.base.BaseFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by apple on 2017/12/2.
 */

public class OneFragment extends BaseFragment {

    @BindView(R.id.fragment_one_button)
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one,container,false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.fragment_one_button)
    public void click(){
        Log.e("111", "click:" );
        showDialog("弹一下");
    }


}
