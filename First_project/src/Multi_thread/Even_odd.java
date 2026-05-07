package Multi_thread;

public class Even_odd {
	private int c=1;
	private final int limit =10;
	private final Object lock = new Object();

	public void Odd() {
		synchronized (lock) {
			while(c<=limit) {
				if(c%2==0) {
					try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
				}
				else {
                    System.out.println("Odd Thread: " + c);
                    c++;
                    lock.notify(); 
                }
			}
		}
	}
	
	public void Even() {
		synchronized (lock) {
			while(c<=limit) {
				if(c%2!=0) {
					try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
				}
				else {
                    System.out.println("Even Thread: " + c);
                    c++;
                    lock.notify(); 
                }
			}
		}
	}
	
	public static void main(String[] args) {
		Even_odd obj=new Even_odd();
		
		Thread t1 = new Thread(() -> obj.Odd());
		Thread t2 = new Thread(() -> obj.Even());
		
		t1.start();
        t2.start();
	}

}
