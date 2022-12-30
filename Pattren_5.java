package javaProject;

public class Pattren_5 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++)//row
	    {
				for(int j=1;j<i;j++) //colomn
	   {
		System.out.print(" ");
	   }
				for(int k=6;k>=i;k--) //col
	   {
				
		System.out.print("* ");//printing a new line to move curser next line
		
	   }
				System.out.println();
	}
		for(int i=1;i<=6;i++)//row
	    {
				for(int j=5;j>=i;j--) //colomn
	   {
		System.out.print(" ");
	   }
				for(int k=1;k<=i;k++) //colomn
	   {
				
		System.out.print("* ");//printing a new line to move curser next line
		
	   }
				System.out.println();
	}
	}
}
