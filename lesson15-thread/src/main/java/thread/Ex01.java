package thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Thread main start");
		// using thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running...");
			}
		};
		t0.start();
		try {
			t0.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// using thread, runnable

		System.out.println("Thread main end");

	}
}
