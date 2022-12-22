package javaProject;

import java.util.Scanner;

public class ProductOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printing the product of natural numbers
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the value");
     //variable declaration
				int num,product=1;
				num =sc.nextInt();
				
				for(int i=1;i<=num;i++) {
					//product*=i;
					product=product*i;
			
				}
				System.out.println("printing sum of product of natural numbers "+num+" is "+product);

	}

}
