/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Java Sederhana
 *Name User: Muh. Asrul Mulis
 *Date: 06/Januari/2023
 *
 *Version(0.3)
 */
import java.util.Scanner;

public class HistoryKalkulator {
	
  public static void main(String[] args) {
	
	//Perulangan ProgramKalkulator#
    while (true) {
	  Scanner input = new Scanner(System.in);
	  Scanner operator = new Scanner(System.in);
	  boolean restart = true;
	  int results =0, numbers1 =1, numbers2 =1;
	  
	  //tampilan Menu
	  System.out.println();
	  System.out.println("===========================================");
	  System.out.println("|  -----<<<<#ProgramKalkulator#>>>>-----  |");
	  System.out.println("===========================================");
	  System.out.println("|Case| 	    |Name Operator| 	 |Operator|");
	  System.out.println("|-----------------------------------------|");
	  System.out.println("| 1  | 	    | Pemjumlahan |      |   <+>  |");
	  System.out.println("| 2  |      | Pengurangan |      |   <->  |");
	  System.out.println("| 3  |      |  Perkalian  |      |   <*>  |");
	  System.out.println("| 4  |      |  Pembagian  |      |   </>  |");
	  System.out.println("===========================================");
	  System.out.print("Input Case: ");
	  int Operator = operator.nextInt();
	  System.out.println("---------------------------");
	  
	  //sistem aritmatika
	  switch(Operator) {
		  case 1:
		      System.out.print("Input Operator: ");
			  String operatorPenjumlahan = operator.next();
			  if(operatorPenjumlahan.equalsIgnoreCase("+"))
				  System.out.print("Enter the Number.1: ");
			      numbers1 = input.nextInt();
				  System.out.print("Enter the Number.2: ");
				  numbers2 = input.nextInt();
				  System.out.println("--------------------------- +");
				  results = numbers1 + numbers2;
				  System.out.println("Total: " + numbers1 + " + " + numbers2 + " = " + results );
				  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
			  break;
		  case 2:
		      System.out.print("Input Operator: ");
			  String operatorPengurangan = operator.next();
			  if(operatorPengurangan.equalsIgnoreCase("-"))
				  System.out.print("Enter the Number.1: ");
			      numbers1 = input.nextInt();
				  System.out.print("Enter the Number.2: ");
				  numbers2 = input.nextInt();
				  System.out.println("--------------------------- -");
				  results = numbers1 - numbers2;
				  System.out.println("Total: " + numbers1 + " - " + numbers2 + " = " + results );
				  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
			  break; 
          case 3:
              System.out.print("Input Operator: ");
              String operatorPerkalian = operator.next();
              if(operatorPerkalian.equalsIgnoreCase("*"))
                  System.out.print("Enter the Number.1: ");
                  numbers1 = input.nextInt();			  
				  System.out.print("Enter the Number.2: ");
				  numbers2 = input.nextInt();
				  System.out.println("--------------------------- x");
				  results = numbers1 * numbers2;
				  System.out.println("Total: " + numbers1 + " * " + numbers2 + " = " + results );
				  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
			  break;
		  case 4:
		      System.out.print("Input Operator: ");
			  String operatorPembagian = operator.next();
			  if(operatorPembagian.equalsIgnoreCase("/"))
				  System.out.print("Enter the Number.1: ");
			      numbers1 = input.nextInt();
				  System.out.print("Enter the Number.2: ");
				  numbers2 = input.nextInt();
				  System.out.println("--------------------------- :");
				  results = numbers1 / numbers2;
				  System.out.println("Total: " + numbers1 + " / " + numbers2 + " = " + results );
				  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
			  break;
		  default:
		  System.out.println("Please choose according to the case!, because the choice you entered is not registered in the case.!!");
		  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	    }
		
		//history Array
	    boolean loadHistory = true;
		int[] switchCase = new int[4];
		
		System.out.print("Do you want to show History?(Y/N): ");
		String riwayatBeban = input.next();
		if(riwayatBeban.equalsIgnoreCase("Y")) {
			loadHistory = true;
			
			System.out.println("Numbers1\t " + "Numbers2\t " + "Operator\t " + "Results ");
			System.out.println("========================================================");
			
			switchCase[0] = numbers1 + numbers2;
		    for(int i = 0; i <= 0; i++) {
			    System.out.printf(" " + numbers1 + " \t\t  " + numbers2 + " \t\t " + "  <+>  " + " \t  " + switchCase[0] );
		    }
			
		    switchCase[1] = numbers1 - numbers2;
		    System.out.println();
		    for(int i = 0; i <= 0; i++) {
			   	System.out.printf(" " + numbers1 + " \t\t  " + numbers2 + " \t\t " + "  <->  " + " \t  " + switchCase[1] );
		    }
			
			switchCase[2] = numbers1 * numbers2;
		    System.out.println();
		    for(int i = 0; i <= 0; i++) {
			   	System.out.printf(" " + numbers1 + " \t\t  " + numbers2 + " \t\t " + "  <*>  " + " \t  " + switchCase[2] );
		    }
			
			switchCase[3] = numbers1 / numbers2;
		    System.out.println();
		   	for(int i = 0; i <= 0; i++) {
			   	System.out.printf(" " + numbers1 + " \t\t  " + numbers2 + " \t\t " + "  </>  " + " \t  " + switchCase[3] );
		    }
			
			System.out.println();
		    System.out.println("========================================================");
		}
	
		//Eksekusi Perulangan
		System.out.print("Do you want to redo your Program?(Y/N): ");
		String mengulangKembali = input.next();
		if(mengulangKembali.equalsIgnoreCase("Y")) {
			restart = true;
		}
		else {
			break;
		}
		//tampilan akhir
		System.out.println("-----------------------------------");
        System.out.println("//STUDI MAHASISWA TI FAKULTAS(IK)//");
        System.out.println("-----------------------------------");
	}
  }
}