package com.example.izzystannett.daggerkotlinexp.dagger;

import com.example.izzystannett.daggerkotlinexp.MainActivity;
import com.example.izzystannett.daggerkotlinexp.ProductListener;

import javax.inject.Singleton;

import dagger.Component;

    // the Component is one of three legs upon which Dagger stands, it is an interface which
    // 1) it lists the com.example.izzystannett.daggerkotlinexp.dagger modules in this app
    // 2) it lists injectable targets

    @Singleton
    @Component(
            modules = {
                    AppModule.class,
                    ShoppingCartModule.class
            }
    )
    public interface AppComponent {
        void inject(ProductListener presenter);
        void inject(MainActivity activity);

    }



