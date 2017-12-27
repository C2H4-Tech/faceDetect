package org.c2h4.facedetect;

import android.app.Application;

/**
 * Created by lixuekang on 2017/12/27.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DetectManager.init(getApplicationContext());
    }
}
