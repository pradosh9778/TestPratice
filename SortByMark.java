package com.test.demo;

import java.util.Comparator;

public class SortByMark implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		
		return (int) (o1.mark -o2.mark);
	}

	

}
