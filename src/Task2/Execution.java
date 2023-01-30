package Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.set.Employee;

public class Execution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Students> li = new ArrayList<>();
		li.add(new Students("sasi", 'v', 'm', 100, 955558755, "chennai", "01-09-1995", " 01-09-2000", "abc2gmail.com"));
		li.add(new Students("vineeth", 'm', 'm', 101, 951554755, "trichy", "12-04-1995", " 01-09-2000",
				"abcgmail.com"));
		li.add(new Students("shabeer", 'k', 'm', 102, 954554755, "chennai", "11-06-1995", " 01-09-2000",
				"abc3gmail.com"));
		li.add(new Students("senu", 'r', 'm', 102, 955554255, "chennai", "21-03-1995", " 01-09-2000", "abc4gmail.com"));
		li.add(new Students("mani", 'a', 'm', 103, 955564755, "trichy", "18-02-1995", " 01-09-2000", "abc5gmail.com"));
		System.out.println("user defined list :");
		System.out.println("===================");

		for (Students students : li) {
			System.out.println("Name :" + students.getStdname());
			System.out.println("Initial :" + students.getInitial());
			System.out.println("Gender :" + students.getGen());
			System.out.println("Id :" + students.getStdid());
			System.out.println("Phone no :" + students.getPhone());
			System.out.println("Address :" + students.getAddress());
			System.out.println("Dob :" + students.getDob());
			System.out.println("Doj :" + students.getDoj());
			System.out.println("Email :" + students.getEmail());

		}
		System.out.println("====================================================================");
		Set<Students> se = new LinkedHashSet<>();
		se.add(new Students("sasi", 'v', 'm', 100, 955558755, "chennai", "01-09-1995", " 01-09-2000", "abc2gmail.com"));
		se.add(new Students("vineeth", 'm', 'm', 101, 951554755, "trichy", "12-04-1995", " 01-09-2000",
				"abcgmail.com"));
		se.add(new Students("shabeer", 'k', 'm', 102, 954554755, "chennai", "11-06-1995", " 01-09-2000",
				"abc3gmail.com"));
		se.add(new Students("senu", 'r', 'm', 102, 955554255, "chennai", "21-03-1995", " 01-09-2000", "abc4gmail.com"));
		se.add(new Students("mani", 'a', 'm', 103, 955564755, "trichy", "18-02-1995", " 01-09-2000", "abc5gmail.com"));
		System.out.println("user defined set :");
		System.out.println("==================");
		for (Students students : se) {
			System.out.println("Name :" + students.getStdname());
			System.out.println("Initial :" + students.getInitial());
			System.out.println("Gender :" + students.getGen());
			System.out.println("Id :" + students.getStdid());
			System.out.println("Phone no :" + students.getPhone());
			System.out.println("Address :" + students.getAddress());
			System.out.println("Dob :" + students.getDob());
			System.out.println("Doj :" + students.getDoj());
			System.out.println("Email :" + students.getEmail());

		}
		System.out.println("=====================================================");
		Map<Integer, Students> m = new HashMap<Integer, Students>();
		m.put(10, new Students("sasi", 'v', 'm', 100, 955558755, "chennai", "01-09-1995", " 01-09-2000",
				"abc2gmail.com"));
		m.put(20, new Students("vineeth", 'm', 'm', 101, 951554755, "trichy", "12-04-1995", " 01-09-2000",
				"abcgmail.com"));
		m.put(30, new Students("shabeer", 'k', 'm', 102, 954554755, "chennai", "11-06-1995", " 01-09-2000",
				"abc3gmail.com"));
		m.put(40,new Students("senu", 'r', 'm', 102, 955554255, "chennai", "21-03-1995", " 01-09-2000", "abc4gmail.com"));
		m.put(50, new Students("mani", 'a', 'm', 103, 955564755, "trichy", "18-02-1995", " 01-09-2000", "abc5gmail.com"));
		System.out.println("user defined map :");
		System.out.println("==================");
		Collection<Students> values = m.values();
		for (Students students : values) {
			System.out.println("Name :" + students.getStdname());
			System.out.println("Initial :" + students.getInitial());
			System.out.println("Gender :" + students.getGen());
			System.out.println("Id :" + students.getStdid());
			System.out.println("Phone no :" + students.getPhone());
			System.out.println("Address :" + students.getAddress());
			System.out.println("Dob :" + students.getDob());
			System.out.println("Doj :" + students.getDoj());
			System.out.println("Email :" + students.getEmail());
			
			
		}

	}
}
