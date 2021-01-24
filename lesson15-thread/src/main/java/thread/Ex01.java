package thread;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("thread main start");

		Thread t0 = new Thread() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "is running");

			}
		};
		t0.start();
		t0.join();

		System.out.println("thread main end");
	}
}
