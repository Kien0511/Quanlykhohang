package com.example.nguyentrungkien.quanlykhohang.Util;

import android.app.Application;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static final String _URL = "http://192.168.31.191:81/quanlykhohang/query.php";
}
