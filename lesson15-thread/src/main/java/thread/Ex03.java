package thread;

import java.util.concurrent.TimeUnit;

public class Ex03 {
	
	static long start=0;
	public static void main(String[] args) {
		start=System.currentTimeMillis();
		System.out.println("Thread main start");
		Thread t0=new Thread(new Task(),"t0");
		Thread t1=new Thread(new Task(),"t1");
		t0.start();
		t1.start();
		System.out.println("Thread main end");
		
		System.out.println("Thread main "+(System.currentTimeMillis()-start));
	}

	private static class Task implements Runnable {

		@Override
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(3);
				
			//	Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " is runnnining");
			System.out.println("Thread task "+(System.currentTimeMillis()-start));
		}

	}
}
