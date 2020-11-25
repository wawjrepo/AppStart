
package com.performance.appstart.tasks;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

//import com.facebook.stetho.Stetho;
import com.performance.appstart.task.Task;

/**
 * 异步的Task
 */
public class InitStethoTask extends Task {

    @Override
    public void run() {
        Log.i("dddd", "InitStethoTask begin");
       int t=1/0;

        Log.i("dddd", "InitStethoTask end");
//        Stetho.initializeWithDefaults(mContext);
    }
}
