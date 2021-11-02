package com.test.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentTest1 {

	public static void main(String[] args) {
		Set<Student1> set = new HashSet<Student1>();
		set.add(new Student1(1, "Sandeep", 68, 20));
		set.add(new Student1(3, "Prakash", 60, 22));
		set.add(new Student1(2, "Pudina", 73, 25));
		set.add(new Student1(4, "Sandeep", 60, 24));
		ArrayList<Student1> arrayList = new ArrayList<Student1>(set);
		Scanner sc = new Scanner(System.in);
		
		String ans;
		do {
			System.out.println("Enter 1 for Id");
			System.out.println("Enter 2 for Name");
			System.out.println("Enter 3 for Marks");
			System.out.println("Enter 4 for Age");
			System.out.println("Defult");
			int select = sc.nextInt();
			switch (select) {
			case 1:{
				System.out.println(arrayList);
				break;}
			case 2:{
				System.out.println(arrayList);
				break;}
			case 3:{
				System.out.println(arrayList);
				break;}
			case 4:{
				System.out.println(arrayList);
				break;}

			default:
				break;
			}
			System.out.println("enter yes/no");
			ans=sc.next();
		}while(ans.equals("yes"));

	}

}
