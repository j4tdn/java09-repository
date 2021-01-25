package thread.pool;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import manager.ThreadManager;
import manager.ThreadManagerImpl;

public class Ex03 {
	private static final int THREAD_POOL_SIZE;
	private static ExecutorService executor;
	private static ThreadManager threadManager;
	
	static {
		THREAD_POOL_SIZE = 4;
		executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager = new ThreadManagerImpl();
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 6);
		List<String> stringList = Arrays.asList("a", "n", "k", "kos");
		List<Double> doubleList = Arrays.asList(9d, 8d, 12d, 93d);
		
		FutureTask<List<Integer>> intTask = new FutureTask<>(() -> {
						TimeUnit.SECONDS.sleep(3);
						return Arrays.asList(1, 2, 3, 4, 6);
				});
		FutureTask<List<String>> stringTask = new FutureTask<>(() ->  {
						TimeUnit.SECONDS.sleep(3);
						return Arrays.asList("a", "n", "k", "kos");
				});
		FutureTask<List<Double>> doubleTask = new FutureTask<>(() ->  {
						TimeUnit.SECONDS.sleep(3);
						return Arrays.asList(9d, 8d, 12d, 93d);
				});
		
		runTask(Arrays.asList(intTask, stringTask, doubleTask));
		
		List<Integer> intResult = intTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = doubleTask.get();
		
		System.out.println("integer size: " + intResult.size());
		System.out.println("string size: " + stringResult.size());
		System.out.println("double size: " + doubleResult.size());
	}

	private static void runTask(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadManager.safelyScheduleTask(executor, task));
		executor.shutdown();
	}
}
