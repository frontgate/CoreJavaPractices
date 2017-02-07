package com.java.practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample{

	public static void main(String args[]){
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		es.execute(new Runnable(){

			@Override
			public void run() {
				System.out.println("Asysnchronous access Implementation ..");
				
			}
			
		});
		
		es.shutdown();
		
	}

}
