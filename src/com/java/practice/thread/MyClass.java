package com.java.practice.thread;

public class MyClass implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		try {
			System.out.println("Thread started :" +t.getName());
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
