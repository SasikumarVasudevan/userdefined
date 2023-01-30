package org.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Execution {
	public static void main(String[] args) {

//	POJO  a =new POJO("sasi", 100, 98585554, "chennai", 'm', "abc@gmail.com", 10000);
//	POJO  a1 =new POJO("shabeer", 101, 98587554, "chennai", 'm', "bcd@gmail.com", 5000);
//	POJO  a3 =new POJO("sasi", 100, 98585554, "chennai", 'm', "abc@gmail.com", 1000);
//
		List<Employee> li = new ArrayList();
		li.add(new Employee("sasi", 100, 98585554, "chennai", 'm', "abc@gmail.com", 10000));
		li.add(new Employee("shabeer", 101, 98587554, "chennai", 'm', "bcd@gmail.com", 5000));
		li.add(new Employee("vineeth", 102, 98587564, "chennai", 'm', "bad@gmail.com", 8000));
		System.out.println("user defined list ");
		for (int i = 0; i < li.size(); i++) {
			Employee employee = li.get(i);
			System.out.println("Name :" + employee.getEmpname());
			System.out.println("EmpId :" + employee.getEmpid());
			System.out.println("Phoneno :" + employee.getPhone());
			System.out.println("Gender :" + employee.getGender());
			System.out.println("Email :" + employee.getEmail());
			System.out.println("Salary :" + employee.getSal());

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		Set<Employee> se=new HashSet<Employee>();
		se.add(new Employee("sasi", 100, 98585554, "chennai", 'm', "abc@gmail.com", 10000) );
		se.add(new Employee("shabeer", 101, 98587554, "chennai", 'm', "bcd@gmail.com", 5000));
		se.add(new Employee("vineeth", 102, 98587564, "chennai", 'm', "bad@gmail.com", 8000));
		System.out.println("user defined Set");
		for (Employee employee : se) {
			System.out.println("Name :" + employee.getEmpname());
			System.out.println("EmpId :" + employee.getEmpid());
			System.out.println("Phoneno :" + employee.getPhone());
			System.out.println("Gender :" + employee.getGender());
			System.out.println("Email :" + employee.getEmail());
			System.out.println("Salary :" + employee.getSal());
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Map<Integer, Employee> m =new LinkedHashMap<>();
		m.put(10, new Employee("sasi", 100, 98585554, "chennai", 'm', "abc@gmail.com", 10000) );
		m.put(20, new Employee("shabeer", 101, 98587554, "chennai", 'm', "bcd@gmail.com", 5000));
		m.put(30, new Employee("vineeth", 102, 98587564, "chennai", 'm', "bad@gmail.com", 8000));
		System.out.println("user defined map");
		Collection<Employee> values = m.values();
		for (Employee employee : values) {
			System.out.println("Name :" + employee.getEmpname());
			System.out.println("EmpId :" + employee.getEmpid());
			System.out.println("Phoneno :" + employee.getPhone());
			System.out.println("Gender :" + employee.getGender());
			System.out.println("Email :" + employee.getEmail());
			System.out.println("Salary :" + employee.getSal());
			
			
		}
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);
	System.out.println("done");
	System.out.println("completed");
	
	}

	}
