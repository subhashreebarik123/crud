package com.java.test.Asynch;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
 class AsynchService {

    @Async
    public void asyncMethod() {
        System.out.println("Executing in thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed!");
    }
}
