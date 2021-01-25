package thread.pool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import manager.ThreadManager;
import manager.ThreadManagerImpl;

public class Ex03 {
	private static final int THREAD_POOL_SIZE;
	private static ExecutorService service;
	private static ThreadManager threadManager;
	static {
		THREAD_POOL_SIZE = 4;
		service = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager = new ThreadManagerImpl();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Future, FutureTask, Callable
		// 3 queries
		FutureTask<List<Integer>> integerTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		});
		FutureTask<List<String>> stringTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("a", "b", "c", "d", "e", "f");
		});
		FutureTask<List<Double>> doubleTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(10d, 11d, 12d, 13d, 14d, 15d, 16d, 17d);
		});

		runTasks(Arrays.asList(integerTask, stringTask, doubleTask));

		List<Integer> integerResult = integerTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = doubleTask.get();

		System.out.println("integer size: " + integerResult.size());
		System.out.println("string size: " + stringResult.size());
		System.out.println("double size: " + doubleResult.size());

	}

	private static void runTasks(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> {
			threadManager.safelyScheduleTask(service, task);
		});
	}
}
