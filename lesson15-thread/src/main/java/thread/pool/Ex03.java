package thread.pool;

import java.util.Arrays;
import java.util.Collection;
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
	private static ExecutorService excutor;
	private static ThreadManager threadManager;
	static {
		THREAD_POOL_SIZE = 4;
		excutor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager = new ThreadManagerImpl();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// future future task callable

		List<String> Stringlist = Arrays.asList("a", "b", "c", "d", "e");
		List<Integer> inlist = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> doublelist = Arrays.asList(10d, 11d, 12d, 13d, 14d);
		FutureTask<List<Integer>> integerTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5);
		});
		FutureTask<List<String>> stringTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("a", "b", "c", "d", "e");
		});

		FutureTask<List<Double>> doubleTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(10d, 11d, 12d, 13d, 14d);
		});

		runTask(Arrays.asList(integerTask, doubleTask, stringTask));

		List<Integer> integerResult = integerTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = doubleTask.get();

		System.out.println("integersize: " + integerResult.size());
		System.out.println("Stringsize: " + stringResult.size());
		System.out.println("Doublesize: " + doubleResult.size());
	}

	private static class Task implements Callable<List<?>> {

		@Override
		public List<?> call() throws Exception {
			// TODO Auto-generated method stub
			TimeUnit.SECONDS.sleep(3);
			System.out.println(Thread.currentThread().getName() + "has ended ");
			return Collections.emptyList();

		}

	}

	private static void runTask(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadManager.safelySceduleTask(excutor, task));
	}
}
