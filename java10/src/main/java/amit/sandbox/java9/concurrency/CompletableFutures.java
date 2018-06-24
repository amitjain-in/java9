package amit.sandbox.java9.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutures {
    public static void main(String[] args) {
        CompletableFuture completableFuture = CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName() + " - In run method Async"));
        System.out.println(completableFuture.isDone());
        if(!completableFuture.isDone()) {
            System.out.println(completableFuture.complete("Done"));
        }
        System.out.println(completableFuture.isDone());
    }
}
