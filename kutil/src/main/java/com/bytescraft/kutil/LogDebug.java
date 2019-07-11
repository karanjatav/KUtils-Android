package com.bytescraft.kutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "K_LOG";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
