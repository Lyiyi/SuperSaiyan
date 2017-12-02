package com.ly.mobile.supersaiyan.base;

import com.squareup.otto.Bus;

/**
 * Created by apple on 2017/12/2.
 */


public class AppBus extends Bus {

    private static AppBus bus;

    public static AppBus getInstance() {
        if (bus == null) {
            bus = new AppBus();
        }
        return bus;
    }

}