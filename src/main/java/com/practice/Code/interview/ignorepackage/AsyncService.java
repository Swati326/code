package com.practice.Code.interview.ignorepackage;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class AsyncService {
    @Async("customTaskExecutor") // Use the custom executor
    public void performTask() {
        System.out.println("Task started in: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // Simulate a delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed in: " + Thread.currentThread().getName());
    }
}
