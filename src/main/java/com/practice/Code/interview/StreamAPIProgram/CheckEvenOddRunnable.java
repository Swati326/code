package com.practice.Code.interview.StreamAPIProgram;

public class CheckEvenOddRunnable implements Runnable{

    private int a;

    public CheckEvenOddRunnable(int a) {
        this.a = a;
    }

    @Override
    public void run() {

        if(a%2==0)
        {
            System.out.println(Thread.currentThread().getName()+": even");
        }
        else {
            System.out.println(Thread.currentThread().getName()+": odd");

        }

    }
}
