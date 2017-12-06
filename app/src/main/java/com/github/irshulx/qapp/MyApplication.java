package com.github.irshulx.qapp;

import android.app.Application;

import com.facebook.stetho.Stetho;


/**
 * Created by mkallingal on 12/23/2015.
 */
public class MyApplication extends Application {

    private String someVariable;

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}