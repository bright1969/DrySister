package com.coderpig.drysisters;

import android.app.Application;
import android.content.Context;

import com.coderpig.drysisters.utils.CrashHandler;
public class DrySisterApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        CrashHandler.getInstance().init(this);
    }

    public static DrySisterApp getContext() {
        return (DrySisterApp) context;
    }
}
