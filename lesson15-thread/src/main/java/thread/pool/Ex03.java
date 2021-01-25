package thread.pool;

import java.util.Arrays;
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
	private static final int THREAD_POOL_SIZE=4;
	private static ExecutorService executor;
	private static ThreadManager threadManager;
	static {
	
		executor=Executors.newFixedThreadPool(THREAD_POOL_SIZE);
		threadManager= new ThreadManagerImpl();
	}
public static void main(String[] args) throws InterruptedException, ExecutionException {
	//future, futureTask, callable
	//3 queries 
	List<Integer> intList=Arrays.asList(1,2,3,4,5);
	List<String> stringList=Arrays.asList("A","B","C","D","E");
	List<Double> douleList=Arrays.asList(10d,11d,12d,13d,14d);
	runTasks(Arrays.asList(intList,stringList,douleList));
	FutureTask<List<Integer>> intergerTask= 
			new FutureTask<>(()->Arrays.asList(1,2,3,4,5));
	FutureTask<List<String>> stringTask= 
			new FutureTask<>(()->Arrays.asList("A","B","C","D","E"));
	FutureTask<List<Double>> doubleTask= 
			new FutureTask<>(()->Arrays.asList(10d,11d,12d,13d,14d));
	
//	runTask(Arrays.asList(intergerTask,stringList,doubleList))
	List<Integer> integerResult=intergerTask.get();
	List<String> stringResult=stringTask.get();
	List<Double> doubleResult=doubleTask.get();
	System.out.println("integer size"+integerResult.size());
	System.out.println("integer size"+stringResult.size());
	System.out.println("integer size"+doubleResult.size());
}
private static class Task implements Callable<List<?>>{

	@Override
	public List<?> call() throws Exception {
		TimeUnit 
		return null;
	}
	
}
private static void runTasks(List<FutureTask<?>> tasks)
{
	tasks.forEach(task->threadManager.safelyScheduleTask(executor,task));
}
}
