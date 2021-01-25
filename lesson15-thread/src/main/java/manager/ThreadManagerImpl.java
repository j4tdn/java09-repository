package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManagerImpl implements ThreadManager{

	@Override
	public Future<?> safelucheduleTask(ExecutorService executor, Runnable runnable) {
		return runtasks(executor, runnable);
	}
	

	public Future<?> runtasks(ExecutorService executor, Runnable runnable) {
		return executor.submit(new Runnable() {
			
			@Override
			public void run() {
				runnable.run();
			}
		});
	}
}
