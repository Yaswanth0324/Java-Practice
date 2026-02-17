package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callable_future_test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task completed!";
        };

        Future<String> result = service.submit(task);
        System.out.println("Waiting for result...");
        System.out.println(result.get()); // waits until result is available

        service.shutdown();

	}

}
