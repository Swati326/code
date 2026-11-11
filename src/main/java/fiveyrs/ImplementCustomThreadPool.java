package fiveyrs;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImplementCustomThreadPool {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        CompletableFuture<String> orderFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Order done");
            return "Order done";
        }, executorService);

        CompletableFuture<String> paymentFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Payment done");
            return "Payment done";
        }, executorService);

        CompletableFuture<String> combined = orderFuture.thenCombine(paymentFuture,
                (orderResult, paymentResult) -> orderResult + " + " + paymentResult);

        System.out.println(combined.join()); // blocks here, once, at the end

        executorService.shutdown();
    }
}
