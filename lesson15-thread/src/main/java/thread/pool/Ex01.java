package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex01 {
	
	private static long start = 0;
	
	public static void main(String[] args) {
		
		start=System.currentTimeMillis();
		int cores=Runtime.getRuntime().availableProcessors();
		System.out.println("Cores: " + cores);
		
		//create thread pool
		ExecutorService service= Executors.newFixedThreadPool(cores);
		
		List<Task> tasks= new ArrayList<>();
		for(int i = 0; i<8;i++) {
			tasks.add(new Task());
		}
		
		for(Task task : tasks) {
			service.execute(task);
		}
		
		service.shutdown();
	}
	
	private static class Task implements Runnable {
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ " is running ...");
			System.out.println(Thread.currentThread().getName() + (System.currentTimeMillis()-start));
		}
		
	}
}
