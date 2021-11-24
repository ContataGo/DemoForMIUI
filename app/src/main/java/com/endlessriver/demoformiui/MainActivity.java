package com.endlessriver.demoformiui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","onCreate() called");
        setContentView(R.layout.activity_main);
        mInfo = (TextView) findViewById(R.id.info);
    }

    @Override
    protected void onStart() {
        Log.d("MainActivity","onStart() called");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.d("MainActivity","onPause() called, do stopLockTask()");
        stopLockTask();
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity","onResume() called");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity","onStop() called, do stopLockTask()");
        stopLockTask();
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d("MainActivity","onDestroy() called, do stopLockTask()");
        stopLockTask();
        super.onDestroy();
    }

    @Override
    protected void onUserLeaveHint(){
        Log.d("MainActivity","onUserLeaveHint() called, do stopLockTask()");
        stopLockTask();
        super.onUserLeaveHint();
    }


    public void startClick(View v){
        Log.d("MainActivity","startLockTask() clicked");
        startLockTask();
        mInfo.setText("startLockTask() clicked and actived");
    }

    public void stopClick(View v){
        Log.d("MainActivity","stopLockTask() clicked");
        stopLockTask();
        mInfo.setText("stopLockTask() clicked and actived");
    }

}