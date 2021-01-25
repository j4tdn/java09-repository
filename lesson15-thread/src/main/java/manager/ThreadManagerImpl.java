package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManagerImpl implements ThreadManager{

	@Override
	public Future<?> safelyScheduleTask(ExecutorService executor, Runnable runable) {
		return runTask(executor , runable);
	}

	private Future<?> runTask(ExecutorService executor, Runnable runable) {
		// TODO Auto-generated method stub
		return executor.submit(new Runnable() {
			
			@Override
			public void run() {
				// always run
				runable.run();
				
			}
		});
	}

	
	}
	
	


