package com.performance.appstart.tasks;

//import com.facebook.drawee.backends.pipeline.Fresco;
//import com.facebook.imagepipeline.core.ImagePipelineConfig;
//import com.facebook.imagepipeline.listener.RequestListener;
import android.util.Log;

import com.performance.appstart.task.Task;
//import com.optimize.performance.net.FrescoTraceListener;


public class InitFrescoTask extends Task {
    @Override
    public void run() {Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();

        for (long i = 0; i < 723456652; i++) {
            String test = "dddd";
            double e = Long.MAX_VALUE / 123456.876543456755555D;
        }
        Log.i("dddd", "InitFrescoTask " + (System.currentTimeMillis() - start));

    }

}
