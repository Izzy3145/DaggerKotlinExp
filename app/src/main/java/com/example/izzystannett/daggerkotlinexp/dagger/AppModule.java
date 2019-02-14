package com.example.izzystannett.daggerkotlinexp.dagger;

import android.content.Context;

import com.example.izzystannett.daggerkotlinexp.ProntoShopApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    // Module is another one of com.example.izzystannett.daggerkotlinexp.dagger's three legs
    // standard java class that will become decorated with Dagger2 specific annotations
    // it's the methods in this class that provide the dependencies
    // this particular module provides the Context

    private final ProntoShopApplication app;

    public AppModule(ProntoShopApplication app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Context provideContext() {
        return app;
    }

    // this is essentially a switch statement saying, in case of context, return app
}
