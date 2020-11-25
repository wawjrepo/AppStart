package com.performance.appstart.tasks.delayinittask;

import com.performance.appstart.task.Task;

public class DelayInitTaskA extends Task {

    @Override
    public void run() {
        // 模拟一些操作
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
