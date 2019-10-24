package com.example.languagelib;

import android.app.Application;

/*-------------------------------------------------------------------------
 * 作者：张渊卓
 * 创建时间： 2019/10/24
 * 版本号：v1.0
 * 本类主要用途描述：
 *
 *-------------------------------------------------------------------------*/
public class MyApp extends Application {

    private static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
    }

    public static Application getApplication() {
        return application;
    }
}
