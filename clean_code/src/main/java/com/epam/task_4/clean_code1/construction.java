package com.epam.task_4.clean_code1;
import java.util.Scanner;
public class construction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("CONSTRUCTION COST PER SQ FEET");
		System.out.println("SELECT THE MATERIAL TYPE");
		System.out.println("1.STANDARD\n2.ABOVE STANDARD\n3.HIGH STANDARD\n4.HIGH STANDARD AND FULLY AUTOMATED HOME");
		int materialStandard=sc.nextInt();
		System.out.println("ENTER THE AREA IN SQ FEET");
		int areaofhouseinsqfeet=sc.nextInt();
		operation1 o=new operation1();
		System.out.println("The cost would be: "+o.calcu(materialStandard,areaofhouseinsqfeet)+"INR");
	}

}
