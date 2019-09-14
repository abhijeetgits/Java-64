package co.edureka.except;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("enter first no: ");
			int n1 = sc.nextInt();
			
			System.out.print("enter second no: ");
			int n2 = sc.nextInt();
			
			int n3 = n1/n2;
			System.out.println("result = "+ n3);	
		}
		catch(ArithmeticException e) {
			System.out.println("Error: "+ e.toString());
		}
		finally {
			System.out.println("application designed & developed by");
			System.out.println("team @ edureka");
			sc.close();
		}
		System.out.println("** done **");
	}
}
