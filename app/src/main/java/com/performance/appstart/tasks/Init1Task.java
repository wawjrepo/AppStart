package com.performance.appstart.tasks;

import android.util.Log;

import com.performance.appstart.task.Task;
//import com.umeng.commonsdk.UMConfigure;

public class Init1Task extends Task {

    @Override
    public void run() {Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();

        for (long i = 0; i <723456652; i++) {
            String test = "dddd";
            String tewst = "dd33dd";
            String tewwst = "dd33d4d";
        }
        Log.i("dddd", "Init1Task " + (System.currentTimeMillis() - start));
    }
}
