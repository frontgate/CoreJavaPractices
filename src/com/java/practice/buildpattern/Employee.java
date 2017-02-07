package com.java.practice.buildpattern;

import java.util.Date;

public class Employee {
	private final int empid;			//Required
	private final String firstname;		//Required
	private final String middlename;	//Optional
	private final String lastname;		//Optional
	private final String address;		//Optional
	private final String fathername;	//Optional
	private final String mothername;	//Optional
	private final Date joiningdate;		//Optional
	
	private Employee(EmployeeBuilder builder) {
		this.empid = builder.empid;
		this.firstname = builder.firstname;
		this.middlename = builder.middlename;
		this.lastname = builder.lastname;
		this.address = builder.address;
		this.fathername = builder.fathername;
		this.mothername = builder.mothername;
		this.joiningdate = builder.joiningdate;
	}
	
	public int getEmpid() {
		return empid;
	}

	public String getFirstname() {
		return firstname;
	}

	
	public String getMiddlename() {
		return middlename;
	}

	
	public String getLastname() {
		return lastname;
	}

	
	public String getAddress() {
		return address;
	}

	public String getFathername() {
		return fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public Date getJoiningdate() {
		return joiningdate;
	}

		
	public static class EmployeeBuilder{
		private final int empid;
		private final String firstname;
		private String middlename;
		private String lastname;
		private String address;
		private String fathername;
		private String mothername;
		private Date joiningdate;
		
		public EmployeeBuilder(int empid, String firstname){
			this.empid = empid;
			this.firstname = firstname;
		}
		
		public EmployeeBuilder middlename(String middlename){
			this.middlename = middlename;
			return this;
		}
		
		public EmployeeBuilder lastname(String lastname){
			this.lastname = lastname;
			return this;
		}
		
		public EmployeeBuilder address(String address){
			this.address = address;
			return this;
		}
		
		public EmployeeBuilder fathername(String fathername){
			this.fathername = fathername;
			return this;
		}
		
		public EmployeeBuilder mothername(String mothername){
			this.mothername = mothername;
			return this;
		}
		
		public EmployeeBuilder joiningdate(Date joiningdate){
			this.joiningdate = joiningdate;
			return this;
		}
		
		public Employee build(){
			return new Employee(this);
		}
	}
	
	public Employee getEmployee(){
		Employee emp =  new Employee.EmployeeBuilder(101, "Amzad")
									.address("Pune")
									.fathername("Sanaullah")
									.build();
		return emp;
	}
	
	/*public static void main(String args){
		Employee emp =  new Employee.EmployeeBuilder(101, "Amzad")
		.address("Pune")
		.fathername("Sanaullah")
		.build();
		
		System.out.println("Empid :" + emp.getEmpid()+" Emp Name : "+ emp.getFirstname() +" Address : "+ emp.getAddress()+" Father's Name " + emp.getFathername());
		
	}*/
}
