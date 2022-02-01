package com.java.comparablecomparator;

import java.util.Comparator;

public class SortPersonByID implements Comparator<PersonComparator> {

	@Override
	public int compare(PersonComparator o1, PersonComparator o2) {
		
		return o1.getId().compareTo(o2.getId());
	}

}
