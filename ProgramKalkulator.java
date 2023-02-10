/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Array Java Sederhana
 *Name: Muh. Asrul Mulis
 *Date: 
 *
 *Version(0.1)
 */
import java.util.Scanner;

public class ProgramKalkulator
{
  public static void main(String[] args)
  {
    while (true)  
    {
      Scanner input = new Scanner(System.in);
      Scanner operator = new Scanner(System.in);
      boolean restart = true;
      int results = 0, num1 =1, num2 =1;

      // tampilan menu
      System.out.println();
      System.out.println("----------------------------------------------------");
      System.out.println("\t====#Program Kalkulator Java#====          :");                
      System.out.println("----------------------------------------------------");
     
      // menu Operator     
      System.out.println(" ========````Pilih Operator Aritmatika````======== |");
      System.out.println("\t\t  ======(+)======                  |");                     
      System.out.println("\t\t  ======(-)======                  |");
      System.out.println("\t\t  ======(*)======                  |");
      System.out.println("\t\t  ======(/)======                  |");    
      System.out.println("====================================================");
      System.out.print(">>>>><<:");
      int Operator = operator.nextInt();
      System.out.println("======================");       
      
      switch (Operator)
      {
        case 1:
            System.out.print("Input Operator  = ");
            String operatorPenjumlahan = operator.next();
            if(operatorPenjumlahan.equalsIgnoreCase("+"))
            System.out.print("Enter the number 1 = ");
            num1 = input.nextInt();
            System.out.print("Enter the number 2 = ");
            num2 = input.nextInt();
            System.out.println("====================== +");
            results = num1 + num2; 
            System.out.println("Total: " + num1 + " + " + num2 + " = " + results );                      
            System.out.println("//////////////////////");
            break;
        case 2:
            System.out.print("Input Operator  = ");
            String operatorPengurangan = operator.next();
            if(operatorPengurangan.equalsIgnoreCase("-"))
            System.out.print("Enter the number 1 = ");
            num1 = input.nextInt();
            System.out.print("Enter the number 2 = ");
            num2 = input.nextInt(); 
            System.out.println("====================== -");
            results = num1 - num2;           
            System.out.println("Total: " + num1 + " - " + num2 + " = " + results );
            System.out.println("///////////////////////"); 
            break;
        case 3:
            System.out.print("Input Operator  = ");            
            String operatorPerkalian = operator.next();
            if(operatorPerkalian.equalsIgnoreCase("*"))
            System.out.print("Enter the number 1 = ");
            num1 = input.nextInt();
            System.out.print("Enter the number 2 = ");
            num2 = input.nextInt();   
            System.out.println("====================== x");    
            results = num1 * num2;            
            System.out.println("Total: " + num1 + " * " + num2 + " = " + results );         
            System.out.println("//////////////////////");         
            break;
        case 4:
            System.out.print("Input Operator  = ");           
            String operatorPembagian = operator.next();
            if(operatorPembagian.equalsIgnoreCase("/"))
            System.out.print("Enter the number 1 = ");
            num1 = input.nextInt();           
            System.out.print("Enter the number 2 = ");
            num2 = input.nextInt(); 
            System.out.println("====================== :");
            results = num1 / num2;          
            System.out.println("Total: " + num1 + " / " + num2 + " = " + results );           
            System.out.println("//////////////////////");                       
            break;
        default:
        System.out.println("Entered the wrong choice, Please choose an option in the menu!");
        System.out.println("---------------------------------------------------------------");
      }
    
      System.out.print("Do you want to repeat? (Y/N) "); 
      String mengulangKembali = input.next();
      if(mengulangKembali.equalsIgnoreCase("Y"))
      {
        restart = true;
      }
      else
      {
        break;
      }
      System.out.println("-----------------------");
      System.out.println("//STUDI MAHASISWA TI//");
      System.out.println("-----------------------");
    }
  }
}