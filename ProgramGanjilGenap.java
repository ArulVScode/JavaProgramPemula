import java.util.Scanner;
public class ProgramGanjilGenap
{
  public static void main(String[] args)
  {
    // inisialisai 
    Scanner input  = new Scanner(System.in);
    int numbers;
    System.out.println("\n");
    System.out.println("PROGRAM MENENTUKAN BILANGAN GANJIL GENAP");
    System.out.println("----------------------------------------");
    System.out.print("Masukan Bilangan: ");
    numbers = input.nextInt();

    // cek apakah bilangan yang di input
    if (numbers % 2 == 0)
    {
      System.out.println("Angka " + numbers + " adalah Bilangan Genap");
    } 
    else
    {
      System.out.println("Angka " + numbers + " adalah Bilangan Ganjil");
    }
  }
}

 
    
