package thread;

public class Ex01 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("thread main start");
	//using thread
	Thread t0 = new Thread() {
		Thread t0 = new Thread("t0");
		@Override
		public void run() {
			//task
         System.out.println(Thread.currentThread().getName() + "is running");

		}
	};
	t0.start();
	t0.join();
	
	//usung thread runabal
	
	System.out.println("thread main end");
}
}
