package thread.pool;

import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import manager.ThreadManager;
import manager.ThreadManagerImpl;

public class Ex03 {
	private static int THREAD_POOL_SIZE = 4;
	private static ExecutorService executor;
	private static ThreadManager threadManager;
	static {
		THREAD_POOL_SIZE = 4;
		executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager = new ThreadManagerImpl();
	}

	private static class Task implements Callable<List<?>> {

		@Override
		public List<?> call() throws Exception {
			TimeUnit.SECONDS.sleep(3);
			System.out.println(Thread.currentThread().getName() + "has ended");
			return Collections.emptyList();
		}

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<String> iintegerList = Arrays.asList("A", "B", "C", "D", "E");
		List<Double> doubleList = Arrays.asList(10d, 11d, 12d, 13d, 14d);

		FutureTask<List<Integer>> integerTask = new FutureTask<List<Integer>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5);
		});

		FutureTask<List<String>> stringTask = new FutureTask<List<String>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("A", "B", "C", "D", "E");
		});
		FutureTask<List<Double>> dounleTask = new FutureTask<List<Double>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(10d, 11d, 12d, 13d, 14d);
		});
		runTask(Arrays.asList(integerTask, stringTask, dounleTask));

		List<Integer> integerResult = integerTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = dounleTask.get();

		System.out.println("integer size: " + integerResult.size());
		System.out.println("string size: " + stringResult.size());
		System.out.println("dounle size: " + doubleResult.size());

	}

	private static void runTask(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadManager.safelyScheduleTask(executor, task));
	}
}