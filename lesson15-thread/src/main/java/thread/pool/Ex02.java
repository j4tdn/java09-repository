package thread.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex02 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//create thread pool 
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Integer> future 	=service.submit(new Task());
		Integer value =	future.get();
		System.out.println("value: "+value );
		
		
		
	}
	
	private static class Task implements Callable<Integer>{

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			return (int) (Math.random()*100);
			
		}
		
	}
	
}
