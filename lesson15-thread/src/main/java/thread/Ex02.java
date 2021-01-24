package thread;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("thread main start");
		
		Thread t0=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName()+"is running name");	
			}
		},"t0");
		t0.start();
		
		
		
		System.out.println("thread main end");
	}
}
