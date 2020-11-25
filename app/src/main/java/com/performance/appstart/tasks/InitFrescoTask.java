package com.performance.appstart.tasks;

//import com.facebook.drawee.backends.pipeline.Fresco;
//import com.facebook.imagepipeline.core.ImagePipelineConfig;
//import com.facebook.imagepipeline.listener.RequestListener;
import android.util.Log;

import com.performance.appstart.task.Task;
//import com.optimize.performance.net.FrescoTraceListener;


public class InitFrescoTask extends Task {
    @Override
    public void run() {
        Log.i("dddd","InitFrescoTask");

//        Set<RequestListener> listenerset = new HashSet<>();
//        listenerset.add(new FrescoTraceListener());
//        ImagePipelineConfig config = ImagePipelineConfig.newBuilder(mContext).setRequestListeners(listenerset)
//                .build();
//        Fresco.initialize(mContext,config);
    }

}
