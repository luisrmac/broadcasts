package com.example.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    public static final String MY_RECEIVER_ACTION = "com.example.broadcasts.MY_RECEIVER_ACTION";
    private static final String TAG = "MyReceiver_TAG";

    public MyReceiver() {
        Log.d(TAG, "MyReceiver: created");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(MY_RECEIVER_ACTION)) {
            Log.d(TAG, "onReceive: received broadcast");
        }
    }
}
