package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ThreadManagerImpl implements ThreadManager {

	public Future<?> safelyScheduleTask(ExecutorService executor, Runnable runnable) {
		return runTask(executor, runnable);
	}

	private Future<?> runTask(ExecutorService executor, Runnable runnable) {
		return executor.submit(new Runnable() {

			@Override
			public void run() {
				runnable.run();
			}
		});

	}

	@Override
	public Future<?> safelyScheduleTask(int threadPoolSize, Runnable runnable) {
		// TODO Auto-generated method stub
		return null;
	}

}
