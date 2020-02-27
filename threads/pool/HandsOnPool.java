package threads.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
*/

public class HandsOnPool {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(5);
        Future future = es.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
                System.out.println("Executando o pipoco");
				return "Pipoco do Trovão";
			}
        });

        System.out.println(""+future.get());

        es.shutdown();

    }
}