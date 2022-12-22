package javaProject;

import java.util.Scanner;

public class Multiplication_program {

	public static void main(String[] args) {
		//java program to calculate multiplication
		//veriable declaration
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");

		int num;
		num =sc.nextInt();
	
		for(int i=1;i<=10;i++) {
			
			System.out.println(num +"*"+ i + "=" + num * i );
		}

	}

}
