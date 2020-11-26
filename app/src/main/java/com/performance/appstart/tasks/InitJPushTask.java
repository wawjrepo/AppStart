package com.performance.appstart.tasks;

//import com.optimize.performance.PerformanceApp;
import android.util.Log;

import com.performance.appstart.task.Task;

import java.util.ArrayList;
import java.util.List;

//import cn.jpush.android.api.JPushInterface;

/**
 */
public class InitJPushTask extends Task {


    @Override
    public void run() {Log.i("ddddddddddddd","ee");
//        JPushInterface.init(mContext);
//        PerformanceApp app = (PerformanceApp) mContext;
//        JPushInterface.setAlias(mContext, 0, app.getDeviceId());
        long start = System.currentTimeMillis();

        for (long i = 0; i <723456652; i++) {
            String test = "dddd";
            double e = Long.MAX_VALUE / 123456.876543456755555D;
        }

        Log.i("dddd", "InitJPushTask " + (System.currentTimeMillis() - start));

    }

}
