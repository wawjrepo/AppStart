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
    public void run() {
        Log.i("dddd","InitWeexTask begin");
        Log.i("dddd","InitWeexTask end");

//        InitConfig config = new InitConfig.Builder().build();
//        WXSDKEngine.initialize((Application) mContext, config);
    }
}
