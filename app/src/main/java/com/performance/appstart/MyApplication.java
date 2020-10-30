package com.performance.appstart;

import android.app.Application;

import com.performance.appstart.tasks.GetDeviceIdTask;
import com.performance.appstart.tasks.InitAMapTask;
import com.performance.appstart.tasks.InitBuglyTask;
import com.performance.appstart.tasks.InitFrescoTask;
import com.performance.appstart.tasks.InitJPushTask;
import com.performance.appstart.tasks.InitStethoTask;
import com.performance.appstart.tasks.InitUmengTask;
import com.performance.appstart.tasks.InitWeexTask;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TaskDispatcher.init(this);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();

        dispatcher.addTask(new InitAMapTask())
                .addTask(new InitStethoTask())
                .addTask(new InitWeexTask())
                .addTask(new InitBuglyTask())
                .addTask(new InitFrescoTask())
                .addTask(new InitJPushTask())
                .addTask(new InitUmengTask())
                .addTask(new GetDeviceIdTask())
                .start();

        dispatcher.await();

    }
}
