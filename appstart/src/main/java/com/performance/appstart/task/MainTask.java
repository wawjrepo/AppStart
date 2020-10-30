package com.performance.appstart.task;

public abstract class MainTask extends com.performance.appstart.task.Task {

    @Override
    public boolean runOnMainThread() {
        return true;
    }
}
