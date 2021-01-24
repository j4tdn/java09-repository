package thread;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Main thread start");
		
		Thread t0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " is running...");
			}
		}, "Thread 0");
		t0.start();
		
		System.out.println("Main thread end");
	}
}
