package com.performance.appstart.tasks.delayinittask;

import com.performance.appstart.task.Task;

public class DelayInitTaskB extends Task {

    @Override
    public void run() {
        // 模拟一些操作

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        LogUtils.i("DelayInitTaskB finished");
    }
}
