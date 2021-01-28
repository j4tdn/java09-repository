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

import manage.CorrectManageImpl;
import manage.ThreadManage;

public class Ex03 {

	private static final int THEARD_POOL_SIZE;
	private static ExecutorService executor;
	private static ThreadManage threadManage;
	static {
		THEARD_POOL_SIZE = 4;
		executor = Executors.newFixedThreadPool(THEARD_POOL_SIZE);
		threadManage = new CorrectManageImpl();

	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// Future,FutureTask,Callable

		// 3 queries

		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		List<String> stringList = Arrays.asList("A", "B", "C", "D", "E");
		List<Double> doubleList = Arrays.asList(10d, 11d, 12d, 13d, 14d, 15d);

		FutureTask<List<Integer>> integerTask = new FutureTask<List<Integer>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5);
		});

		FutureTask<List<String>> stringTask = new FutureTask<List<String>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("A","B","C","D","E");
		});
		FutureTask<List<Double>> doubleTask = new FutureTask<List<Double>>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
		});

		runTasks(Arrays.asList(integerTask, stringTask,doubleTask));
		List<Integer> integerResult = integerTask.get();
		List<String> stringResult = stringTask.get();
		List<Double> doubleResult = doubleTask.get();

		System.out.println("integer size:" + integerResult.size());
		System.out.println("string size:" + stringResult.size());
		System.out.println("double size:" + doubleResult.size());

	}

	private static class Task implements Callable<List<?>> {

		@Override
		public List<?> call() throws Exception {
			TimeUnit.SECONDS.sleep(3);
			System.out.println(Thread.currentThread().getName() + " has ended");
			return Collections.emptyList();

		}

	}

	private static void runTasks(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadManage.safelySchedualTask(executor, task));

	}

}
