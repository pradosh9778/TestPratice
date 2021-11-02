package com.test.demo;

import java.util.Comparator;

public class Student1 implements Comparator<Student1> {
	int id;
	String name;
	double mark;
	int age;

	public Student1(int id, String name, double mark, int age) {
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.age = age;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {

		return o1.id - o2.id;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}

}
