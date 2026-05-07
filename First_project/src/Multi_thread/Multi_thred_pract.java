package Multi_thread;

public class Multi_thred_pract extends Thread {
	
	public void run()
	{
		for(int i=0; i<5; i++) {
//		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Creating object
		Multi_thred_pract t0=new Multi_thred_pract(); // new state
		t0.start();
		// Sleep
		t0.sleep(2000); // pause execution for specific duration
	
		
		Multi_thred_pract t1=new Multi_thred_pract();
		t1.start();
//		System.out.println("Priority for t1: "+t1.getPriority()); //5
//		t1.setPriority(1);
//		System.out.println("Priority for t1 after set: "+t1.getPriority());
		
		Multi_thred_pract t2=new Multi_thred_pract(); //
		t2.start();
		t2.setName("Max");
		

	
		
		

	}


}
