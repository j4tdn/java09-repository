package thread.pool;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// created thread pool
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future = service.submit(new Task());
		Integer value = future.get();
		System.out.println("value: " + value);

	}

	private static class Task implements Callable<Integer> {
		//FutureTask<List<String>> = new 

		@Override
		public Integer call() throws Exception {
			return (int) (Math.random() * 100);
		}

	}

}
