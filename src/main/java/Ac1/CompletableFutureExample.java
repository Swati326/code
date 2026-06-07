package Ac1;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

        public static void main(String[] args) {

            CompletableFuture<String> paymentFuture =
                    CompletableFuture.supplyAsync(() -> {
                        System.out.println("Calling Payment Service...");
                        sleep(2);
                        return "Payment Success";
                    });

            CompletableFuture<String> inventoryFuture =
                    CompletableFuture.supplyAsync(() -> {
                        System.out.println("Checking Inventory...");
                        sleep(1);
                        return "Inventory Available";
                    });

            CompletableFuture<String> notificationFuture =
                    CompletableFuture.supplyAsync(() -> {
                        System.out.println("Sending Notification...");
                        sleep(1);
                        return "Notification Sent";
                    });

            CompletableFuture<String> completableFuture=CompletableFuture.supplyAsync(()->{
                System.out.println("Calling A service");
                return "Called Successfully";
            });

            // Wait for all tasks to complete
            CompletableFuture.allOf(paymentFuture, inventoryFuture, notificationFuture,completableFuture).join();

            // Get results
            System.out.println(paymentFuture.join());
            System.out.println(inventoryFuture.join());
            System.out.println(notificationFuture.join());
        }

        static void sleep(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

