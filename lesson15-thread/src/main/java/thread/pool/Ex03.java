package thread.pool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
	private static ThreadManager threadmanage;

	static {
		THREAD_POOL_SIZE = 4;
		executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadmanage = new ThreadManagerImpl();
	}

	// future ,future task, callable
	// 3queries
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<String> stringList = Arrays.asList("A", "B", "C", "D", "E");
		List<Double> doubleList = Arrays.asList(10d, 11d, 12d, 13d, 14d);
		FutureTask<List<Integer>> integerTask = 
				new FutureTask<List<Integer>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5);
		});
		FutureTask<List<String>> stringTask = 
				new FutureTask<List<String>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("A", "B", "C", "D", "E");
		});
		FutureTask<List<Double>> doubleTask = 
				new FutureTask<List<Double>>(() -> {
			return Arrays.asList(10d, 11d, 12d, 13d, 14d);
		});

		runTask(Arrays.asList(integerTask, stringTask, doubleTask));
		List<Integer> integerResult = integerTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = doubleTask.get();
		System.out.println("Integesize " + integerResult.size());
		System.out.println("Stringsize " + stringResult.size());
		System.out.println("doublesize " + doubleResult.size());

	}

	private static class Task implements Callable<List<?>> {

		@Override
		public List<?> call() throws Exception {
			TimeUnit.SECONDS.sleep(3);
			System.out.println(Thread.currentThread().getName() + "is coming...");

			return Collections.emptyList();
		}

	}

	private static void runTask(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadmanage.safelyScheduleTask(executor, task));

	}
}
