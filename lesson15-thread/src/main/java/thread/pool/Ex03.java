package thread.pool;

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

	private static final int THREAD_POOL_SIZE;
	private static ExecutorService executor;
	private static ThreadManager threadManager;

	static {
		THREAD_POOL_SIZE = 4;
		executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager = new ThreadManagerImpl();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Future, FutureTask, Callable
		// 3 queries
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<String> stringList = Arrays.asList("A", "B", "C", "D", "E");
		List<Double> doubleList = Arrays.asList(10d, 11d, 12d, 13d, 14d, 15d);

		FutureTask<List<Integer>> intergerTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5);
		});

		FutureTask<List<String>> stringTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("A", "B", "C", "D", "E");
		});

		FutureTask<List<Double>> doubleTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(10d, 11d, 12d, 13d, 14d, 15d);
		});

		runTasks(Arrays.asList(intergerTask, stringTask, doubleTask));

		List<Integer> integerResult = intergerTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = doubleTask.get();

		System.out.println("integer size: " + integerResult.size());
		System.out.println("string size: " + stringResult.size());
		System.out.println("double size: " + doubleResult.size());
	}

	private static void runTasks(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadManager.safelyScheduleTask(executor, task));
	}
}
