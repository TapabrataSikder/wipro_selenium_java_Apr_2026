package Multi_thread;

public class Synchronize_test extends Thread{
	
	int count=0;
	synchronized void count()
	{
		count++;
	}
	
	public static void main(String[] args) {
		Synchronize_test t1=new Synchronize_test();
		t1.count();
		Synchronize_test t2=new Synchronize_test();
		t2.count();
	}

}



 
 

 