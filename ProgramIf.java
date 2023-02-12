/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Java Sederhana
 *
 *Name: Muh. Asrul Mulis
 *Date: 12/February/2023
 *Time: 20:25 - 20:31
 *
 *Version(0.6)
 */

import java.util.Scanner;

public class ProgramIf {
   
   public static void main(String[] args) {
      String nama, nim;
	  int nilai;
	  Scanner enter = new Scanner(System.in);
	  
	  //Tampilan Awal
	  System.out.println("===========================");
	  System.out.print("Enter Name: ");
	  nama = enter.nextLine();
	  System.out.print("Enter Nim: ");
	  nim = enter.nextLine();
	  System.out.println("===========================");
	  System.out.print("Enter Result Value: ");
	  nilai = enter.nextInt();
	  
	  //Pengoprasian If, Else if,...Else
	  if(nilai > 85&& nilai <=100) {
		  System.out.println("Best Value: A");
	  }
	  else if(nilai > 75&& nilai <=85) {
		  System.out.println("Good Job Value: B");
	  }
	  else if(nilai > 65&& nilai <=75) {
		  System.out.println("Quite Goood: C");
	  }
	  else if(nilai > 45&& nilai <=65) {
		  System.out.println("Enougt: D");
	  }
	  else if(nilai <=45) {
		  System.out.println("Error: E");
	  }
	  
   }
}
