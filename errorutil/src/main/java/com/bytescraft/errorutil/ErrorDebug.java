package com.bytescraft.errorutil;

import android.util.Log;

public class ErrorDebug {

    private static final String TAG = "K_LOG_ERROR";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
