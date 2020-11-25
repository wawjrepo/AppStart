package com.performance.appstart.tasks;

import android.util.Log;

import com.performance.appstart.task.Task;

public class InitBuglyTask extends Task {

    @Override
    public void run() {
        Log.i("dddd","InitBuglyTask begin");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.i("dddd","InitBuglyTask end");
//        CrashReport.initCrashReport(mContext, "注册时申请的APPID", false);
    }
}
