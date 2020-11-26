package com.performance.appstart.tasks;

import android.util.Log;

import com.performance.appstart.task.Task;
//import com.umeng.commonsdk.UMConfigure;

public class Init3Task extends Task {

    @Override
    public void run() {Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();

        for (long i = 0; i <723456652; i++) {
            String test = "dddd";
        }
        Log.i("dddd", "Init3Task " + (System.currentTimeMillis() - start));
    }
}
