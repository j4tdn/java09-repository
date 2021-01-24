package thread;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("Main thread start");
		
		Thread t0 = new Thread(new Task(), "Thread 0");
		Thread t1 = new Thread(new Task(), "Thread 1");
		t0.start();
		t1.start();
		
		System.out.println("Main thread end");
	}
	
	private static class Task implements Runnable{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + " is running...");
		}
		
	}
}
