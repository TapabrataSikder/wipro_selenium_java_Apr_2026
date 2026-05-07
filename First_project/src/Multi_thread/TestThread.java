package Multi_thread;

public class TestThread implements Runnable {
	
	// With runnable interface compulsory to use abstract method run()
	public void run() {
		for(int i=1;i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t0=new TestThread();
		TestThread t1=new TestThread();
		t0.run();
		t1.run();
		System.out.println(t0.equals(t1));
		
		
	}
}
