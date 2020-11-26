package com.performance.appstart.tasks;

import android.util.Log;

import com.performance.appstart.task.Task;
//import com.taobao.weex.InitConfig;
//import com.taobao.weex.WXSDKEngine;

/**
 * 主线程执行的task
 */
public class InitWeexTask extends Task {



    @Override
    public void run() {Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();

        for (long i = 0; i < 723456652; i++) {
            String test = "dddd";
            double e = Long.MAX_VALUE / 123456.876543456755555D;
        }
        Log.i("dddd", "InitWeexTask " + (System.currentTimeMillis() - start));

//        InitConfig config = new InitConfig.Builder().build();
//        WXSDKEngine.initialize((Application) mContext, config);
    }
}
