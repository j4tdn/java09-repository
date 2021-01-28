package thread;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("thread main start!");
		
		//using thread
		
		Thread t0=new Thread("t0") {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" is running ..........");
				super.run();
			}
		};
		
		t0.start();
		t0.join();
		
		//using Thread,runable  
	

				System.out.println("thread main end!");
		
		
	}
}
