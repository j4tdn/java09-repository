package manage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public interface ThreadManage {
	Future<?> safelySchedualTask(ExecutorService executor,Runnable runnable);
}
