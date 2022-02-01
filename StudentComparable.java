package com.java.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StudentComparable {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(102, "khilesh1", 99));
		list.add(new Student(12, "khilesh2", 94));
		list.add(new Student(32, "khilesh3", 98));
		list.add(new Student(4, "khilesh4", 91));

		list.forEach(System.out::println);
		System.out.println("-----AFTER-------");
		Collections.sort(list);
		list.forEach(System.out::println);

		System.out.println("-----using java 8-------");
		
		List<Student> sortedList = list.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
	}

}
