package com.java.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonComparatorImpl {

	public static void main(String[] args) {
		
		ArrayList<PersonComparator> list = new ArrayList<PersonComparator>();
		list.add(new PersonComparator(10211, "KHILESH1", 54));
		list.add(new PersonComparator(211, "KHILESH2", 56));
		list.add(new PersonComparator(1211, "KHILESH3", 14));
		list.add(new PersonComparator(11, "KHILESH4", 5));
		
		
		list.forEach(System.out::println);
		
		
		Collections.sort(list, new SortPersonByID());
		
		list.forEach(System.out::println);
		
		Collections.sort(list, new Comparator<PersonComparator>() {

			@Override
			public int compare(PersonComparator o1, PersonComparator o2) {
				// TODO Auto-generated method stub
				return o1.getId().compareTo(o2.getId());
			}
		});
		list.forEach(System.out::println);
	}

}
