package com.practice.Code.interview.ignorepackage;

public class EvenOddUsingThread {
        private static final int LIMIT = 10; // Limit up to which numbers will be printed
        private static int number = 1; // Shared number between threads
        private static final Object LOCK = new Object(); // Lock for synchronization

        public static void main(String[] args) {
            // Thread to print odd numbers
            Thread oddThread = new Thread(() -> {
                while (number <= LIMIT) {
                    synchronized (LOCK) {
                        if (number % 2 != 0) { // Check if number is odd
                            System.out.println("Odd: " + number);
                            number++;
                            LOCK.notify(); // Notify the even thread
                        } else {
                            try {
                                LOCK.wait(); // Wait for the even thread
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
            });

            // Thread to print even numbers
            Thread evenThread = new Thread(() -> {
                while (number <= LIMIT) {
                    synchronized (LOCK) {
                        if (number % 2 == 0) { // Check if number is even
                            System.out.println("Even: " + number);
                            number++;
                            LOCK.notify(); // Notify the odd thread
                        } else {
                            try {
                                LOCK.wait(); // Wait for the odd thread
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
            });

            // Start both threads
            oddThread.start();
            evenThread.start();
        }

}
