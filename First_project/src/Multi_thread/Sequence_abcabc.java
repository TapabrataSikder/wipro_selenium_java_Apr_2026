package Multi_thread;

public class Sequence_abcabc implements Runnable {
	
	private static final Object lock = new Object();
    private static int status = 0;
    private final int threadId;
    private final char charToPrint;
    
    public Sequence_abcabc(int threadId, char charToPrint) {
        this.threadId = threadId;
        this.charToPrint = charToPrint;
    }
	
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (lock) {
                while (status != threadId) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                
                System.out.print(charToPrint); 
                status = (status + 1) % 3;
                lock.notifyAll();
            }
        }
    }

	public static void main(String[] args) {
		Thread t1 = new Thread(new Sequence_abcabc(0, 'A'));
        Thread t2 = new Thread(new Sequence_abcabc(1, 'B'));
        Thread t3 = new Thread(new Sequence_abcabc(2, 'C'));

        t1.start();
        t2.start();
        t3.start();

	}
}
