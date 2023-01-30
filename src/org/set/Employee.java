package org.set;

public class Employee {
	private String Empname;
	private int Empid;
	private int phone;
	private String address;
	private char gender;
	private String email;
	private int sal;
	public String getEmpname() {
		return Empname;
	}
	
	public int getEmpid() {
		return Empid;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getSal() {
		return sal;
	}

	public Employee(String empname, int empid, int phone, String address, char gender, String email, int sal) {
		super();
		Empname = empname;
		Empid = empid;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
		this.email = email;
		this.sal = sal;
	}
	
	
	
	

}
