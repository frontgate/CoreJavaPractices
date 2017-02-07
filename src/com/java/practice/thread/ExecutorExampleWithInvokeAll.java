package com.java.practice.thread;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExampleWithInvokeAll {
	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Set<Callable<String>> callable = new HashSet<Callable<String>>();
		
		callable.add(new Callable<String>(){

			@Override
			public String call() throws Exception {
				return "Task 1";
			}
			
		});
		
		callable.add(new Callable<String>(){

			@Override
			public String call() throws Exception {
			
				return "Task 2";
			}
			
		});
		
		callable.add(new Callable<String>(){

			@Override
			public String call() throws Exception {
			
				return "Task 3";
			}
			
		});
		
		
		List<Future<String>> futures = null;
		try {
			futures = es.invokeAll(callable);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		for(Future<String> future:futures){
			try {
				System.out.println("Future : "+ future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		
	}

}
