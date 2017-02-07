package com.java.practice.thread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExampleWithInvokeAny {

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
		
		String result = null;
		try {
			result = es.invokeAny(callable);
		} catch (InterruptedException e) {
				e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("Result is : "+result);
		
	}

}
