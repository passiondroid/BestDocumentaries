package com.app.best.documentaries;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by arif on 11/10/17.
 */

public class DocumentaryApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Calligraphy initialization
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/DroidSans-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
