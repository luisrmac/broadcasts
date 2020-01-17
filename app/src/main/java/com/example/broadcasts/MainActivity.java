package com.example.broadcasts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity_TAG";
    private MyReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        receiver = new MyReceiver();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(MyReceiver.MY_RECEIVER_ACTION);
        registerReceiver(receiver, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(receiver);
    }

    public void sendMessage(View view) {
        Log.d(TAG, "sendMessage: ");
        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction(MyReceiver.MY_RECEIVER_ACTION);
        sendBroadcast(broadcastIntent);
    }
}
