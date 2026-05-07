package Multi_thread;

public class Thread_yeild extends Thread{
	
	public void run() 
	{
		for(int i=1; i<=3; i++) {
			System.out.println(i);
			Thread.yield();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_yeild t1 =new Thread_yeild();
		t1.start();
		Thread_yeild t2 =new Thread_yeild();
		t2.start();
		
//		Thread_yeild t1=new Thread_yeild(() -> {
//			for(int i=1; i<=3; i++) {
//				System.out.println("Thread 1: "+i);
//				Thread.yield();
//			}
//		});
//		
//		Thread_yeild t2=new Thread_yeild(() -> {
//			for(int i=1; i<=3; i++) {
//				System.out.println("Thread 1: "+i);
//				Thread.yield();
//			}
//		});
//		t1.start();
//		t2.start();
	}

}
