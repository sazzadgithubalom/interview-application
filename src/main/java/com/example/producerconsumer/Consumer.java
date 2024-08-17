package com.example.producerconsumer;

public class Consumer extends Thread {

	Company company = new Company();

	public Consumer(Company company) {
		this.company = company;
	}

	public void run() {
		while (true) {
			try {
				company.consumerItem();
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
