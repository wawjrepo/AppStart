
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
        Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();

        for (long i = 0; i < 723456652; i++) {
            String test = "dddd";
            double e = Long.MAX_VALUE / 123456.876543456755555D;
        }
        Log.i("dddd", "InitStethoTask " + (System.currentTimeMillis() - start));
//        Stetho.initializeWithDefaults(mContext);
    }
}
