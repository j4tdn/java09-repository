package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.Severity;

public class Ex01 {
	private static long start = 0;
	
	public static void main(String[] args) {
		// create thread pool
		start = System.currentTimeMillis();
		int cores = Runtime.getRuntime().availableProcessors();
		System.out.println("cores" + cores);
		ExecutorService service = Executors.newFixedThreadPool(cores);

		List<Task> tasks = new ArrayList<>();
		for(int i = 0; i< 8 ; i++) {
			tasks.add(new Task());
		}
		for(Task task: tasks ) {
			service.execute(task);
		}
		service.shutdown();
	}
	private static class Task implements Runnable{
		
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is running...");
			System.out.println(Thread.currentThread().getName() + ": " + (System.currentTimeMillis() - start));
			
		} 
	}
}
