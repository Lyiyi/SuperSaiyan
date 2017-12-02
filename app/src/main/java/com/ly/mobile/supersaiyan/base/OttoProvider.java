package com.ly.mobile.supersaiyan.base;

import com.squareup.otto.Bus;

/**
 * Created by apple on 2017/12/2.
 */

public class OttoProvider {
    private volatile static Bus bus = null;

    private OttoProvider() {
    }

    public static Bus getInstance() {
        if (bus == null) {
            synchronized (OttoProvider.class) {
                bus = new Bus();
            }
        }
        return bus;
    }
}
