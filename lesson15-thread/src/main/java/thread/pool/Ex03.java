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
	private static final int THREAD_POOL_SIZE ;
	private static ExecutorService executor;
	private static ThreadManager threadManager;
	
	static {
		THREAD_POOL_SIZE =4 ;
		executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager = new ThreadManagerImpl();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		FutureTask<List<Integer>> integerTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(1, 2, 3, 4, 5);
		});
		FutureTask<List<String>> stringTask = new FutureTask<>(() ->{
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList("A", "B", "C", "D");
		} ) ;
		FutureTask<List<Double>> doubleTask = new FutureTask<>(() -> {
			TimeUnit.SECONDS.sleep(3);
			return Arrays.asList(10d, 11d, 12d, 13d);
		});

		runTask (Arrays.asList(integerTask, stringTask, doubleTask));
		List<Integer> intList = integerTask.get();
		List<String> stringList = stringTask.get();
		List<Double> doubleList = doubleTask.get();

		System.out.println("integer size:" + intList.size());
		System.out.println("string size:" + stringList.size());
		System.out.println("double size:" + doubleList.size());
	}

	private static void runTask(List<FutureTask<?>> tasks) {
		tasks.forEach(task -> threadManager.safelyScheduleTask(executor, task));
	}
	
}
