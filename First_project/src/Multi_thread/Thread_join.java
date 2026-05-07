package Multi_thread;

public class Thread_join {
	static class JoinThread extends Thread{
			
		public void run()
		{
			for(int i=0; i<5; i++) {
	
			System.out.println(Thread.currentThread().getName());
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		JoinThread t0=new JoinThread();
		JoinThread t1=new JoinThread();
		JoinThread t2=new JoinThread();
		t0.start();
		t0.join();
		t1.start();
		t2.start();
		t2.join();

	}



}
