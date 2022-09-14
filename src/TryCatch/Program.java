package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
		}
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
		}
	
	public static void method2() {
	System.out.println("**** METHOD2 START ****");	
     Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) { //adcionou informação fora do limite
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e ) { //valor invalido ex a 
			System.out.println("Input ERROR");
		}
		System.out.println("End of program");
		sc.close();
		System.out.println("**** METHOD2 END ****");	

	}
}
