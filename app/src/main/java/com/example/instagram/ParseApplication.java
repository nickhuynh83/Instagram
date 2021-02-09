package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("nQDFhUXBQpYa5Uu4LreAEhDKgCamMFrEsiT9ildW")
                .clientKey("jaRhVsiIyh0QaoZVEXNnjZexV7k2ouoScnw3MFqe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
