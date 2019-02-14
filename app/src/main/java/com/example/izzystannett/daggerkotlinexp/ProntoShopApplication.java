package com.example.izzystannett.daggerkotlinexp;

import android.app.Application;

import com.example.izzystannett.daggerkotlinexp.dagger.AppComponent;
import com.example.izzystannett.daggerkotlinexp.dagger.AppModule;

public class ProntoShopApplication extends Application {
    private static ProntoShopApplication instance = new ProntoShopApplication();
    private static AppComponent appComponent;

    public static ProntoShopApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        getAppComponent();
    }


    public AppComponent getAppComponent() {
        if (appComponent == null){
            appComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .build();
        }
        return appComponent;
    }

}
