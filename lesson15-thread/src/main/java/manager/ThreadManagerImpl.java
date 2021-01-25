package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ThreadManagerImpl implements ThreadManager {
	@Override
	public Future<?> safelyScheduleTask(ExecutorService service, Runnable runnable) {
		return runTasks(service, runnable);
	}

	private Future<?> runTasks(ExecutorService service, Runnable runnable) {
		return service.submit(new Runnable() {

			@Override
			public void run() {
				// always run
				runnable.run();
			}
		});
	}
}
