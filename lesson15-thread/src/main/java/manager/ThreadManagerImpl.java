package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadManagerImpl implements ThreadManager {

	@Override
	public Future<?> safelySceduleTask(ExecutorService excutor, Runnable runnable) {
		// TODO Auto-generated method stub
		//ExecutorService excutor = Executors.newFixedThreadPool(threadPoolSize);
		
		return runTask(excutor,runnable);
	}

	private Future<?> runTask(ExecutorService excutor, Runnable runnable) {
		// TODO Auto-generated method stub
		return excutor.submit(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
					runnable.run();
			}
		});
	}
	
}
