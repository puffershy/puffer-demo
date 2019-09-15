package com.puffer.demo.lifecycle;

import org.springframework.context.SmartLifecycle;

/**
 * lifecycle 使用
 *
 * @author buyi
 * @date 2019年09月16日 00:22:13
 * @since 1.0.0
 */
public class MyLifeCycle implements SmartLifecycle {
    @Override
    public void start() {
        System.out.println("MyLifeCycle start ……");
    }

    @Override
    public void stop() {
        System.out.println("MyLifeCycle stop ……");
    }

    @Override
    public boolean isRunning() {
        System.out.println("MyLifeCycle isRunning");
        return true;
    }

    @Override
    public boolean isAutoStartup() {
        System.out.println("MyLifeCycle isAutoStartup");
        return true;
    }

    @Override
    public void stop(Runnable runnable) {

    }

    @Override
    public int getPhase() {
        System.out.println("phase");
        return 0;
    }
}
