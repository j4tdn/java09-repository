package thread;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("Thread main start:");
		Thread t0 = new Thread(new Runnable() {
			//task
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "is running... ");
				
			}
		}, "t0");
		t0.start();
		System.out.println("thread main end");
	}

}
