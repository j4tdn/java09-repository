package manager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface ThreadManager {
	Future<?> safelySceduleTask(ExecutorService excutor,Runnable runnable);
}
