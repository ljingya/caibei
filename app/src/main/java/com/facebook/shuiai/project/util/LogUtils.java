package com.facebook.shuiai.project.util;

import android.util.Log;

import com.facebook.shuiai.project.application.MyApplication;

/**
 * 统一管理log类
 */
public class LogUtils {

    private static final String TAG = "LogUtils";

    private static final boolean LOGGER = MyApplication.isDebug;

    public static void v(String tag, String msg) {
        if (LOGGER) {
            Log.v(TAG, tag + "-->" + msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LOGGER) {
            Log.d(TAG, tag + "-->" + msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LOGGER) {
            Log.i(TAG, tag + "-->" + msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LOGGER) {
            Log.v(TAG, tag + "-->" + msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LOGGER) {
            Log.e(TAG, tag + "-->" + msg);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (LOGGER) {
            Log.e(TAG, tag + "-->" + msg);
        }
    }
}
