package manage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class CorrectManageImpl implements ThreadManage {

	@Override
	public Future<?> safelySchedualTask(ExecutorService executor,  Runnable runnable) {
		return runTask(executor, runnable);
	}

	private Future<?> runTask(ExecutorService executor, Runnable runnable) {
		// TODO Auto-generated method stub
		return executor.submit(new Runnable() {
			
			@Override
			public void run() {
				runnable.run();
				
			}
		});
	}
	
}
