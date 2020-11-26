package com.performance.appstart;

import android.app.Application;
import android.util.Log;

import com.performance.appstart.task.Task;
import com.performance.appstart.tasks.GetDeviceIdTask;
import com.performance.appstart.tasks.Init1Task;
import com.performance.appstart.tasks.Init2Task;
import com.performance.appstart.tasks.Init3Task;
import com.performance.appstart.tasks.Init4Task;
import com.performance.appstart.tasks.Init5Task;
import com.performance.appstart.tasks.InitAMapTask;
import com.performance.appstart.tasks.InitBuglyTask;
import com.performance.appstart.tasks.InitFrescoTask;
import com.performance.appstart.tasks.InitJPushTask;
import com.performance.appstart.tasks.InitStethoTask;
import com.performance.appstart.tasks.InitUmengTask;
import com.performance.appstart.tasks.InitWeexTask;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TaskDispatcher.init(this, false);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();
        long start = System.currentTimeMillis();
        dispatcher.addTask(new InitAMapTask().needWait())
                .addTask(new InitStethoTask().needWait().runOnMainThread())
                .addTask(new InitBuglyTask().needWait().runOnMainThread())
                .addTask(new InitWeexTask().needWait().runOnMainThread())
                .addTask(new InitFrescoTask().needWait())
                .addTask(new InitJPushTask().needWait().runOnMainThread())
                .addTask(new InitUmengTask().needWait())
                .addTask(new Init5Task().needWait().after(Init2Task.class))
                .addTask(new Init1Task().needWait())
                .addTask(new Init2Task().needWait())
                .addTask(new Init3Task().needWait())
                .addTask(new Init4Task().needWait())
                .start();

//
//
//        dispatcher.addTask(new InitAMapTask().runOnMainThread().needWait())
//                .addTask(new InitStethoTask().runOnMainThread().needWait())
//                .addTask(new InitBuglyTask().runOnMainThread().needWait())
//                .addTask(new InitWeexTask().runOnMainThread().needWait())
//                .addTask(new InitFrescoTask().runOnMainThread().needWait())
//                .addTask(new InitJPushTask().runOnMainThread().needWait())
//                .addTask(new InitUmengTask().runOnMainThread().needWait())
//                .addTask(new Init1Task().runOnMainThread().needWait())
//                .addTask(new Init2Task().runOnMainThread().needWait())
//                .addTask(new Init3Task().runOnMainThread().needWait())
//                .addTask(new Init4Task().runOnMainThread().needWait())
//                .addTask(new Init5Task().runOnMainThread().needWait())
//                .start();
        dispatcher.await();
        Log.i("dddd", "      total " + (System.currentTimeMillis() - start));


    }
}
