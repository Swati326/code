package com.practice.Code.interview.ignorepackage;

public class MultiThreadedQuetions {

        // Define a Runnable class to create threads
        static class Counter implements Runnable {
            private String name;

            Counter(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(name + " Counter: " + i);
                    try {
                        Thread.sleep(1000); // Pause for 1 second to simulate work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static void main(String[] args) {
            // Create and start two threads
            Thread thread1 = new Thread(new Counter("Thread-1"));
            Thread thread2 = new Thread(new Counter("Thread-2"));
            Thread thread3=new Thread(new Counter("Thread-3"));

            thread1.start();  // Start the first thread
            thread2.start();// Start the second thread
            thread3.start();

            try {
                thread1.join();  // Wait until thread1 finishes execution
                thread2.join();
                thread3.join(); // Wait until thread2 finishes execution
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Both threads have finished execution.");
        }


}
