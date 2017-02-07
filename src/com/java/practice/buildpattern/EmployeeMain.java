package com.java.practice.buildpattern;

public class EmployeeMain {

	public static void main(String[] args) {
		
			Employee emp =  new Employee.EmployeeBuilder(101, "Amzad")
			.address("Pune")
			.fathername("Sanaullah")
			.build();
			
			System.out.println("Empid :" + emp.getEmpid()+" Emp Name : "+ emp.getFirstname() +" Address : "+ emp.getAddress()+" Father's Name " + emp.getFathername());
			
		

	}

}
