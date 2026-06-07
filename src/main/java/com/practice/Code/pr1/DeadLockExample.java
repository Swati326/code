package com.practice.Code.pr1;

public class DeadLockExample {

        static final Object lock1 = new Object();
        static final Object lock2 = new Object();

        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                synchronized (lock1) {
                    System.out.println("Thread 1: Locked lock1");

                    try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                    synchronized (lock2) {
                        System.out.println("Thread 1: Locked lock2");
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (lock1) {  // same order as thread1
                    System.out.println("Thread 2: Locked lock1");

                    try { Thread.sleep(100); } catch (InterruptedException ignored) {}

                    synchronized (lock2) {
                        System.out.println("Thread 2: Locked lock2");
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
    }



