package com.performance.appstart.tasks;

import android.util.Log;

import com.performance.appstart.task.Task;

public class InitBuglyTask extends Task {

    @Override
    public void run() {Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();

        for (long i = 0; i < 723456652; i++) {
            String test = "ddd3444444d";
            double e = Long.MAX_VALUE / 13456.876543456755555D;
        }
        Log.i("dddd", "InitBuglyTask " + (System.currentTimeMillis() - start));
//        CrashReport.initCrashReport(mContext, "注册时申请的APPID", false);
    }
}
