package com.practice.Code.interview.ignorepackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
        @Autowired
        private AsyncService asyncService;

        @GetMapping("/start-task")
        public String startTask() {
            System.out.println("Request received on: " + Thread.currentThread().getName());
            asyncService.performTask(); // Call the async method
            System.out.println("Response sent from: " + Thread.currentThread().getName());
            return "Task triggered!";
        }
    }



