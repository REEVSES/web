package com.liuyao.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @program: web
 * @description: Spring boot线程池配置
 * @author: LiuB
 * @create: 2018-09-30 11:17
 **/
@Component
public class AsyncTask {
    @Async("processExecutor")
    public void start() {
        double random = Math.random();
        int sleepInt = (int) (random * 2000);
        try {
            Thread.sleep(sleepInt);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
