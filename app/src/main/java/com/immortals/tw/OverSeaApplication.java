package com.immortals.tw;

import android.app.Application;
import android.content.Context;

import com.facebook.ads.AudienceNetworkAds;
import com.global.sdk.GMSDK;
import com.google.firebase.FirebaseApp;

import androidx.multidex.MultiDex;
import tw.com.mycard.sdk.libs.PSDKApplication;


/**
 * Created by LioN on 2018/11/27.
 * Func：
 */
public class OverSeaApplication extends PSDKApplication {



    @Override
    public void onCreate() {
        super.onCreate();
        GMSDK.initApplication(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}
