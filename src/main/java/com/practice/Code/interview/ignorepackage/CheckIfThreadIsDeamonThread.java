package com.practice.Code.interview.ignorepackage;

public class CheckIfThreadIsDeamonThread extends Thread {


    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("daemon Thread is started");
        }
        else {
            System.out.println("Normal Thread is running");
        }

    }


    public static void main(String[] args) throws InterruptedException {
        CheckIfThreadIsDeamonThread checkIfThreadIsDeamonThread=new CheckIfThreadIsDeamonThread();
        checkIfThreadIsDeamonThread.setDaemon(true);
        checkIfThreadIsDeamonThread.start();
        Thread.sleep(200);

    }


}
