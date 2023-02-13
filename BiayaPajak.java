/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Java Sederhana
 *Name: Muh. Asrul Mulis
 *Date: 10/Februari/2023
 *
 *Version(0.4)
 */

import java.util.Scanner;

public class BiayaPajak {
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double a = 1;
		double b = 1;
		double c = 1;
		double d = 1;
		double e = 1;
        double results  = 0;
		
		System.out.println();
		System.out.println("<<--WELCOME TO MY PROGRAM-->>");
	    System.out.println("---------------------");
		System.out.print("Motorbike Tax. A: ");
	    a = input.nextInt();
		System.out.print("Land Tax. B: ");
		b = input.nextInt();
		results = a + b;
		System.out.println("Input: " + a + " + " + b + " = " + results );
		System.out.println("---------------------");
		System.out.print("Development Tax.C: ");
		c = input.nextInt();
		System.out.print("Tax Deducation.D: ");
		d = input.nextDouble();
		d = d /100;
		results = c * d;
		System.out.println("Input: " + c + " * " + d + "%" + " = " + results );
		System.out.println("---------------------");
		System.out.print("Car Tax.E: ");
		e = input.nextInt();
		results = c + e;
		System.out.println("Total Tax: " + c + " + " + e + " = " + results );
		System.out.println("---------------------");
	    results = a + b + c + d + e;
		System.out.println("Total Results Tax: " + a + " + " + b + " + " + c + " + " + d + "%" + " + " + e + " = " + results );
	}
}