package thread;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread main start");

		// using Thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				// task
				System.out.println(Thread.currentThread().getName() + "is running....");
			}
		};
		t0.join();
		for(int i = 0 ; i<100000;i++) {
			if (i == 99999) {
				System.out.println("Thread main end");
			}
		}
	}
}
