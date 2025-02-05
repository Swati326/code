package com.practice.Code.interview.ignorepackage;

public class ThreadUsingRunnableInterface implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=5;i++) {
            System.out.println("Thread name is: " + Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        ThreadUsingRunnableInterface t=new ThreadUsingRunnableInterface();
        Thread thread1=new Thread(t,"thread-1");
        Thread thread2=new Thread(t,"thread-2");
        thread1.start();
        thread2.start();
    }
}
