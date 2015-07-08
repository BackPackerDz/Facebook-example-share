package com.tutosandroidfrance.facebook;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by Back Packer
 * Date : 08/07/15
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // On initialise la SDK de Facebook
        FacebookSdk.sdkInitialize(getApplicationContext());
    }

}
