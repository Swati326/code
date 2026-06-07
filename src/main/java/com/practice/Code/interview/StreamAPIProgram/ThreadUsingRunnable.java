package com.practice.Code.interview.StreamAPIProgram;

public class ThreadUsingRunnable{

    public static void main(String[] args) {

        CheckEvenOddRunnable checkEvenOddRunnable=new CheckEvenOddRunnable(6);

        Thread thread = new Thread(checkEvenOddRunnable);
        thread.setName("I am thread" );
        thread.start();

    }

}





