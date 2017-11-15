package com.iamsdt.roomdemo;

import android.app.Application;

import com.iamsdt.roomdemo.dependencyinjection.ApplicationComponent;

/**
 * Created by Shudipto Trafder on 11/15/2017.
 */

public class RoomDemoApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .roomModule(new RoomModule(this))
                .build();

    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}