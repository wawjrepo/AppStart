package com.performance.appstart.task;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;

import androidx.core.os.TraceCompat;

import com.performance.appstart.BuildConfig;
import com.performance.appstart.TaskDispatcher;
import com.performance.appstart.stat.TaskStat;
import com.performance.appstart.utils.DispatcherLog;

import java.util.logging.Logger;

/**
 * 任务真正执行的地方
 */

public class DispatchRunnable implements Runnable {
    private Task mTask;
    private TaskDispatcher mTaskDispatcher;

    public DispatchRunnable(Task task) {
        this.mTask = task;
    }

    public DispatchRunnable(Task task, TaskDispatcher dispatcher) {
        this.mTask = task;
        this.mTaskDispatcher = dispatcher;
    }

    @Override
    public void run() {
        TraceCompat.beginSection(mTask.getClass().getSimpleName());
        DispatcherLog.i(mTask.getClass().getSimpleName()
                + " begin run" + "  Situation  " + TaskStat.getCurrentSituation());

        Process.setThreadPriority(mTask.getPriority());

        long startTime = System.currentTimeMillis();

        mTask.setWaiting(true);
        mTask.waitToSatisfy();

        long waitTime = System.currentTimeMillis() - startTime;
        startTime = System.currentTimeMillis();

        // 执行Task
        mTask.setRunning(true);
        try {
            mTask.run();
        } catch (Exception e) {
            e.printStackTrace();
            if (TaskDispatcher.debug) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(mTask.mApplication, "Application的" + mTask.getClass().getSimpleName() + "初始化错误：" + e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
            }
        } finally {
            // 执行Task的尾部任务
            Runnable tailRunnable = mTask.getTailRunnable();
            if (tailRunnable != null) {
                tailRunnable.run();
            }

            if (!mTask.needCall() || !mTask.isRunOnMainThread()) {
                printTaskLog(startTime, waitTime);

                TaskStat.markTaskDone();
                mTask.setFinished(true);
                if (mTaskDispatcher != null) {
                    mTaskDispatcher.satisfyChildren(mTask);
                    mTaskDispatcher.markTaskDone(mTask);
                }
                DispatcherLog.i(mTask.getClass().getSimpleName() + " finish");
            }
            TraceCompat.endSection();
        }

    }

    /**
     * 打印出来Task执行的日志
     *
     * @param startTime
     * @param waitTime
     */
    private void printTaskLog(long startTime, long waitTime) {
        long runTime = System.currentTimeMillis() - startTime;
        if (DispatcherLog.isDebug()) {
            DispatcherLog.i(mTask.getClass().getSimpleName() + "  wait " + waitTime + "    run "
                    + runTime + "   isMain " + (Looper.getMainLooper() == Looper.myLooper())
                    + "  needWait " + (mTask.isNeedWait() || (Looper.getMainLooper() == Looper.myLooper()))
                    + "  ThreadId " + Thread.currentThread().getId()
                    + "  ThreadName " + Thread.currentThread().getName()
                    + "  Situation  " + TaskStat.getCurrentSituation()
            );
        }
    }

}
