package thread;

public class Ex04 {
	// shared object
	private static volatile int counter = 2;

	public static void main(String[] args) {
		System.out.println("Thread main start");

		Thread t0 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("T0 is running");
				counter++;
				System.out.println("t0: " + counter);
			}
		});
		t0.start();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("T1 is running");
				counter *= 2;
				System.out.println("t1: " + counter);
			}
		});
		t1.start();

		counter += 2;
		System.out.println("main: " + counter);
		System.out.println("Thread main end");
	}
}
