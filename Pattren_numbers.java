package javaProject;

public class Pattren_numbers  {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");	
		}
		
		System.out.println();//printing a new line to move curser next line
		}
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}	
			System.out.println( );
		}
	}

}
