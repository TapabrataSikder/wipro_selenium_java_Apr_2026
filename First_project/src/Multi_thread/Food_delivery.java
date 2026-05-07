package Multi_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Delivery implements Runnable {
    private String order;

    public Delivery(String name) {
        this.order = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " picked up: " + order);
        try {

            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " complete delivery of: " + order);
    }
}

public class Food_delivery {

	public static void main(String[] args) {
		ExecutorService t1 = Executors.newFixedThreadPool(3);
		for (int i = 1; i <= 5; i++) {
            String order = "Order #" + i;
            Delivery task = new Delivery(order);
            
            System.out.println("Placing " + order);
            t1.execute(task); 
        }
		t1.shutdown();
		
	}

}
