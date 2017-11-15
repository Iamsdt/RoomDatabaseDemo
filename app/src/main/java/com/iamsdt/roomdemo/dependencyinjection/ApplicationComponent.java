package com.iamsdt.roomdemo.dependencyinjection;

import android.app.Application;

import com.iamsdt.roomdemo.create.CreateFragment;
import com.iamsdt.roomdemo.detail.DetailFragment;
import com.iamsdt.roomdemo.list.ListFragment;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Shudipto Trafder on 11/15/2017.
 */

@Singleton
@Component(modules = {})
public interface ApplicationComponent {

    void inject(ListFragment listFragment);
    void inject(CreateFragment createFragment);
    void inject(DetailFragment detailFragment);

    Application application();

}
