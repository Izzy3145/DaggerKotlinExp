package com.example.izzystannett.daggerkotlinexp.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.izzystannett.daggerkotlinexp.ShoppingCart;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ShoppingCartModule {
    //this class is another module that will provide instances of ShoppingCart
    @Provides
    @Singleton
    SharedPreferences providesSharedPreference(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
    //as getting sharedPreferences depends on context, dagger2 knows to ask @Module AppModule for an instance of the Application

    @Provides @Singleton
    ShoppingCart providesShoppingCart(SharedPreferences preferences){
        return  new ShoppingCart(preferences);
    }

}
