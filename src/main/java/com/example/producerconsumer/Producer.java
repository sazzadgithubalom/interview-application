package com.example.producerconsumer;

public class Producer extends Thread {

	Company company = new Company();

	public Producer(Company company) {
		this.company = company;
	}
	
	public void run() {
		Integer product = 1;
		while (true) {
			try {
				company.produceItem(product);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			product++;
		}
	}
	
}
