package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService_test {
	public static void main(String[] args) {
		// Create a pool of 3 threads
        ExecutorService service = Executors.newFixedThreadPool(3);

        // Submit 5 customer tasks
        for (int i = 1; i <= 5; i++) {
            int customerId = i;
            service.execute(() -> {
                System.out.println("Serving customer " + customerId + " by " + Thread.currentThread().getName());
            });
        }

        service.shutdown(); // Shutdown the executor after tasks are done
	}


}
