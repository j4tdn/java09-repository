package thread;

import java.util.concurrent.TimeUnit;

public class Ex03 {
	private static long start = 0;
	
	public static void main(String[] args) {
		start = System.currentTimeMillis();
		System.out.println("Thread main start");
		
		Thread t0 = new Thread(new Task(), "t0");
		Thread t1 = new Thread(new Task(), "t1");
		t0.start();
		t1.start();
		
		System.out.println("Thread main end");
		System.out.println("Thread main: " + (System.currentTimeMillis() - start));
	}
	
	private static class Task implements Runnable {
		@Override
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is running ...");
			System.out.println(Thread.currentThread().getName() + " : " + (System.currentTimeMillis() - start));
		}
	}
}
