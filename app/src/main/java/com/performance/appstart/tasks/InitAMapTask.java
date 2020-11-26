package com.performance.appstart.tasks;

import android.util.Log;

import com.performance.appstart.task.Task;

public class InitAMapTask extends Task {

//    private AMapLocationClient mLocationClient = null;
//    private AMapLocationClientOption mLocationOption = null;
//    private AMapLocationListener mLocationListener = new AMapLocationListener() {
//        @Override
//        public void onLocationChanged(AMapLocation aMapLocation) {
//            // 一些处理
//        }
//    };

    @Override
    public void run() {
        Log.i("ddddddddddddd","ee");
        long start = System.currentTimeMillis();
        for (long i = 0; i < 723456652; i++) {
            String test = "dddd";
            double e = Long.MAX_VALUE / 123456.876543456755555D;
        }
        Log.i("dddd", "InitAMapTask " + (System.currentTimeMillis() - start));
//        mLocationClient = new AMapLocationClient(mContext);
//        mLocationClient.setLocationListener(mLocationListener);
//        mLocationOption = new AMapLocationClientOption();
//        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
//        mLocationOption.setOnceLocation(true);
//        mLocationClient.setLocationOption(mLocationOption);
//        mLocationClient.startLocation();
    }
}
