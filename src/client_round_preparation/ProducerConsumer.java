package client_round_preparation;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		
		BlockingQueue<Integer> bq= new ArrayBlockingQueue<>(1);
		
		new Thread(()->    // producer class
		{
			for(int i=1;i<3;i++)
			{
				try {
					bq.put(i);
					System.out.println("produce"+ i);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}).start();
		
		new Thread(()->    // consumer class
		{
			for(int i=1;i<3;i++)
			{
				try {
					int val=  bq.take();
					System.out.println("Consume"+val);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
			}
		}).start();
	}

}
