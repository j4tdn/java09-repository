package thread;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Thread main start");
		
		// using Thread
		Thread t0 = new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "is running...");
			}
		};
		
		t0.start();
		
		// using Runnable
		System.err.println("Error");
		System.out.println("Thread main end");
	}
}
