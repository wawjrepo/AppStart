package com.performance.appstart;

import android.app.Application;

import com.performance.appstart.task.Task;
import com.performance.appstart.tasks.GetDeviceIdTask;
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
        TaskDispatcher.init(this,false);

        TaskDispatcher dispatcher = TaskDispatcher.createInstance();

        dispatcher.addTask(new InitAMapTask())
                .addTask(new InitStethoTask())
                .addTask(new InitBuglyTask())
                .addTask(new InitWeexTask())
                .addTask(new InitFrescoTask().runAsSoon())
                .addTask(new InitJPushTask())
                .addTask(new InitUmengTask())
                .start();
        dispatcher.await();

    }
}
