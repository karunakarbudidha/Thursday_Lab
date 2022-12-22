package javaProject;

import java.util.Scanner;

public class Odd_numbers {

	public static void main(String[] args) {
		int num;
//calculating sum of odd numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		//veriable declaration 
        int sum=0;
		num =sc.nextInt();
	
		for(int i=1;i<=num;i+=2) {
			
			sum=sum+i;
			
			System.out.println("printing all odd numbers"+sum);
		
		}

	}

}
