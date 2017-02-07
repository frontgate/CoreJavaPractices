package com.java.practice.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExampleWithSubmit {
	public static void main(String args[]){
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Future <String> future;
		
		future = es.submit(new Callable<String>(){

			@Override
			public String call() throws Exception {
				System.out.println("Asysnchronous access .. ");
				return "This is callable result ..";
			}
			
		});
		
		try {
			System.out.println("Future : "+future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		es.shutdown();
		
	}
}
