package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex01 {
	
	private static long start = 0;
	
	public static void main(String[] args) {
		
		start = System.currentTimeMillis();
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("cores: " + cores);
		// create thread pool
		ExecutorService service = Executors.newFixedThreadPool(15);
		
		// 1 thread -> 8 tasks -> 24s
		// 4 threads -> 8 tasks -> 6s
		List<Task> tasks = new ArrayList<>();
		for (int i = 0 ; i < 16; i++) {
			tasks.add(new Task());
		}
		
		for (Task task: tasks) {
			service.execute(task);
		}
		
		service.shutdown();
	}
	
	private static class Task implements Runnable {
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// System.out.println(Thread.currentThread().getName() + " is running ...");
			System.out.println(Thread.currentThread().getName() + ": " + (System.currentTimeMillis() - start));
		}
	}
}
