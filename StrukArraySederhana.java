/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Array Java Sederhana
 *Name: Muh. Asrul Mulis
 *Date: 15/February/2003
 *
 *Version(10.0)
 */
import java.util.Scanner;

public class StrukArraySederhana {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x;
		String goods[];
		double total =0, price[], results[], cost[];
		goods = new String[5];
		price = new double[5];
		results = new double[5];
		cost = new double[5];
		
		
		System.out.print("Input the order quantity: ");
		x = input.nextInt();
		System.out.println("------------------------");
		for(int a =0; a < x; a++) {
			System.out.println("===========================");
			System.out.print("Input the name goods: ");
			goods[a] = input.next();
			System.out.print("Input the price of the item: ");
			price[a] = input.nextDouble();
			System.out.print("Input the number of items: ");
			results[a] = input.nextDouble();
			System.out.println("==============================");
			cost[a] = price[a] * results[a];
			System.out.println("Fees Paid: " + "Rp." + cost[a] );
			total = total + cost[a];
		}
		System.out.println("\nPurchased items");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Goods              Results           Price            Cost");
		System.out.println("-----------------------------------------------------------");
		for(int b =0; b < x; b++) {
			System.out.println( goods[b] + "            " + results[b] + "              " + price[b] + "             " + cost[b] );
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("The Total cost of all: " + "Rp." + total );
		System.out.println("-----------------------------------------");
	}
}