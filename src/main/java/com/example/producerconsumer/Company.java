package com.example.producerconsumer;

public class Company{
	Integer product;
	
	Boolean isProduced = false;
	
	 synchronized public void produceItem(Integer product) throws InterruptedException{
		 if (isProduced) {
			wait();
		}
		Thread.sleep(1000);
		this.product = product;
		System.out.println("Produced: "+ product);
		isProduced = true;
		notify();
	}
	
	 synchronized public Integer consumerItem() throws InterruptedException{
		 if (!isProduced) {
			wait();
		}
		Thread.sleep(1000);
		System.out.println("Consumed: "+ product);
		isProduced = false;
		notify();
		return product;
	}
}
