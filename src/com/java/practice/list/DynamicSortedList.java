package com.java.practice.list;

import java.util.LinkedList;

public class DynamicSortedList {
	private static LinkedList<Integer> llist;
	
	public static void main(String[] args) {
		 llist = new LinkedList<>();
		 
		 addValue(10);
		 addValue(6);
		 addValue(10);
		 addValue(10);
		 addValue(10);
		 addValue(10);
		 addValue(10);
		 addValue(10);
		 addValue(10);
		 
	}
	
	private static void addValue(int value){
		
		if(llist.size() == 0){
			llist.add(0, value);
		}else if(llist.size() > 0 && llist.get(0) > value ){
			llist.add(0,value);
		}else if(llist.get(llist.size() - 1) < value){
			llist.add(llist.size());
		}else{
			int i = 0;
			while(llist.get(i) > value){
				i++;
			}
			llist.add(i,value);
		}
	}

}
