package com.practice.Code.interview.ignorepackage;


import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

public class AsyncConfig {
        @Bean(name = "customTaskExecutor")
        public Executor taskExecutor() {
            ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
            executor.setCorePoolSize(10);  // Minimum threads in the pool
            executor.setMaxPoolSize(10); // Maximum threads in the pool
            executor.setQueueCapacity(25); // Tasks waiting to execute
            executor.setThreadNamePrefix("AsyncThread-"); // Custom thread name
            executor.initialize(); // Initialize the thread pool
            return executor;
        }
    }



