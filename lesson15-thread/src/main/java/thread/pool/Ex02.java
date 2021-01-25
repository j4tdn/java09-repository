package thread.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex02 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Future<Integer> future = service.submit(new Task());
		Integer value = null;
		Integer test1 = 99;
		System.out.println(test1);
		try {
			value = future.get();
			System.out.println(value);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		value = 6;
		System.out.println(value);
		
		Integer test2 = 99;
		System.out.println(test2);
	}
	
	private static class Task implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			Thread.sleep(2000);
			return (int) (Math.random() * 100);
		}
		
	}
}
