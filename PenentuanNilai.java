/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Java Sederhana(Menampilkan IPS & IPK serta Profile)
 *Name: Muh. Asrul Mulis
 *Date: 14/February/2023
 *
 *Version(0.8)
 */
 
import java.util.Scanner;

public class PenentuanNilai {
   
  public static void main(String[] args) {
	  
   while (true) {
	   
	   /*Berikut beberapa deklarasi yang di gunakan.
	    *Untuk deklari SKS anda bisa merubah parameter nya yang sesuai dengan 
		*SKS yang telah di tentukan oleh Universitas anda.
		*Cara menentukan total SKS, anda hanya perlu menjumlahkan seluruh SKS dari pertama hinga akhir
		*
		*SELAMAT MENCOBA <'-'>
		*/
	  Scanner number = new Scanner(System.in);
	  Scanner input = new Scanner(System.in);
	  int results =0, SKS =20, task =1, quiz =1;
	  double value =1, UTS =30, UAS =40, IPS =0, IPK =0;
	  boolean startBack = true;
	  
	  //Tampilan Awal Program
	  boolean profileView = true;
	  System.out.print("Do you want to enter profile?(Y/N): ");
	  String tampilanProfile = input.nextLine();
	  if(tampilanProfile.equalsIgnoreCase("Y")) {
		  profileView = true;
		  
		  //Tampilan PROFILE MAHASISWA
	      System.out.println("=======================================");
	      System.out.println("|<<<=====# PROFILE MAHASISWA #=====>>>|");
	      System.out.println("---------------------------------------");
	      System.out.print("Name\t\t : ");
	      String nameMahasiswa = input.nextLine();
	      System.out.print("Nim\t\t : ");
	      String nimeMahasiswa = input.nextLine();
	      System.out.println("Study Program\t : Teknik Informatika");
	      System.out.println("Country \t : REPUBLIK INDONESIA");
	      System.out.print("Religion\t : ");
	      String agamaMahasiswa = input.nextLine();
	      System.out.print("Pleace of Birth  : ");
	      String infoMahasiswa = input.nextLine();
	      System.out.print("Date of Birth    : ");
	      String dataMahasiswa = input.nextLine();
	      System.out.print("Mobile Phone Num : ");
	      String numMahasiswa = input.nextLine();
	      System.out.println("Student Status   : Aktif");
	      System.out.println("=======================================");
	    }
	  else {
		  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
		  System.out.println("<Thank you for choosing, Please enter the value according to your course so we can do the appropriate calculation to display your total IPS score.>");
		  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
	    }

	 //Tampilan Menu Bobot Nilai 
     /*untuk melihat hasil IPS anda:
      *Anda harus memilih dari Case.1 yang akan berjalan sampai dengan Case.8
      *Untuk menempilkan Hasil IPS, anda perlu menjumlahkan seluruh total hasil tugas 
      *Mulai dari Case pertama hingga akhir untuk melakukan tahap berikutnya, yaitu. 
      *Membagi hasil dari seluruh Tugas yang telah di dapatkan dengan total SKS pada semester.1.
      *IPS anda akan terlihat di akhir.
      *
      *SELAMAT MENCOBA SEMOGA BERHASIL :)
      */
      System.out.println("========================================");
	  System.out.println("|---->>># Value Weight Display #<<<----|");
      System.out.println("|--------------------------------------|");
      System.out.println("| No |        | Weight|        | Value |");
      System.out.println("|----|--------|-------|--------|-------|");
      System.out.println("| 1. |        | < A > |        | ( 4 ) |");
      System.out.println("| 2. |        | < B > |        | ( 3 ) |");
      System.out.println("| 3. |        | < C > |        | ( 2 ) |");
      System.out.println("| 4. |        | < D > |        | ( 1 ) |");
      System.out.println("| 5. |        | < E > |        | ( 0 ) |");
      System.out.println("========================================");
      System.out.print("Input Case: ");
      int Nilai = number.nextInt();
      System.out.println("=======================================");
	  
      int nilai1 =1, nilai2 =1; 
		  
	  switch (Nilai) {
	      case 1:
	          System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai 
		      nilai1 = number.nextInt();
		      if (nilai1 > 3&& nilai1 ==4) {
		          System.out.println("Result Task: < A >");
		        }
		      else if(nilai1 > 2&& nilai1 ==3) {
			      System.out.println("Result Task: < B >");
		        }
		      else if(nilai1 > 1&& nilai1 ==2) {
		     	  System.out.println("Result Task: < C >");
		        }
		      else if(nilai1 > 0&& nilai1 ==1) {
		    	  System.out.println("Result Task: < D >");
		        }
		      else if(nilai1 <=0) {
			      System.out.println("Result Task: < E >");
		        }
		      System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah yang di tentukan
		      nilai2 = number.nextInt();
		      results = nilai1 * nilai2;
		      System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
		      System.out.println("----------------------------------------");
	      case 2:
	          System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai
		      nilai1 = number.nextInt();
		      if (nilai1 > 3&& nilai1 ==4) {
		    	  System.out.println("Result Task: < A >");
		        }
		      else if(nilai1 > 2&& nilai1 ==3) {
	    		  System.out.println("Result Task: < B >");
	     	    }
	    	  else if(nilai1 > 1&& nilai1 ==2) {
			      System.out.println("Result Task: < C >");
	    	    }
	    	  else if(nilai1 > 0&& nilai1 ==1) {
	    		  System.out.println("Result Task: < D >");
	    	    }
	    	  else if(nilai1 <=0) {
	    		  System.out.println("Result Task: < E >");
	    	    }
	    	  System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah di tentukan
	    	  nilai2 = number.nextInt();
	    	  results = nilai1 * nilai2;
	    	  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	       	  System.out.println("----------------------------------------");
	   	  case 3:
	          System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai
	    	  nilai1 = number.nextInt();
	   		  if (nilai1 > 3&& nilai1 ==4) {
	    		  System.out.println("Result Task: < A >");
	    	    }
	    	  else if(nilai1 > 2&& nilai1 ==3) {
	    		  System.out.println("Result Task: < B >");
	    	    }
	    	  else if(nilai1 > 1&& nilai1 ==2) {
	     		  System.out.println("Result Task: < C >");
	    	    }
	    	  else if(nilai1 > 0&& nilai1 ==1) {
	    		  System.out.println("Result Task: < D >");
	    	    }
	    	  else if(nilai1 <=0) {
	    		  System.out.println("Result Task: < E >");
		        }
	    	  System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah yang telah di tentukan
	    	  nilai2 = number.nextInt();
		      results = nilai1 * nilai2;
	    	  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	   		  System.out.println("----------------------------------------");
	   	  case 4: 
   		      System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai
	   		  nilai1 = number.nextInt();
	   		  if (nilai1 > 3&& nilai1 ==4) {
	   			  System.out.println("Result Task: < A >");
	   		    }
	   		  else if(nilai1 > 2&& nilai1 ==3) {
	    		  System.out.println("Result Task: < B >");
	     	    }
		      else if(nilai1 > 1&& nilai1 ==2) {
	    		  System.out.println("Result Task: < C >");
	    	    }
	    	  else if(nilai1 > 0&& nilai1 ==1) {
	   			  System.out.println("Result Task: < D >");
	   		    }
	   		  else if(nilai1 <=0) {
	     		  System.out.println("Result Task: < E >");
	     	    }
	    	  System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah yang telah di tentukan 
	   		  nilai2 = number.nextInt();
	   		  results = nilai1 * nilai2;
	   		  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	   		  System.out.println("----------------------------------------");
	   	  case 5:
	   	      System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai
	   		  nilai1 = number.nextInt();
	   		  if (nilai1 > 3&& nilai1 ==4) {
	   			  System.out.println("Result Task: < A >");
	   		    }
	   		  else if(nilai1 > 2&& nilai1 ==3) {
	    		  System.out.println("Result Task: < B >");
	    	    }
	   		  else if(nilai1 > 1&& nilai1 ==2) {
		    	  System.out.println("Result Task: < C >");
	    	    }
	    	  else if(nilai1 > 0&& nilai1 ==1) {
	   			  System.out.println("Result Task: < D >");
	   		    }
	   		  else if(nilai1 <=0) {
	   			  System.out.println("Result Task: < E >");
	   		    }
	   		  System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah yang telah di tentukan
		   	  nilai2 = number.nextInt();
	    	  results = nilai1 * nilai2;
	    	  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	    	  System.out.println("----------------------------------------");
	      case 6:
	          System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai
		      nilai1 = number.nextInt();
		      if (nilai1 > 3&& nilai1 ==4) {
	    		  System.out.println("Result Task: < A >");
	    	    }
	   		  else if(nilai1 > 2&& nilai1 ==3) {
	   			  System.out.println("Result Task: < B >");
	    	    }
		   	  else if(nilai1 > 1&& nilai1 ==2) {
		   		  System.out.println("Result Task: < C >");
	    	    }
		   	  else if(nilai1 > 0&& nilai1 ==1) {
	   			  System.out.println("Result Task: < D >");
		   	    }
		   	  else if(nilai1 <=0) {
	   			  System.out.println("Result Task: < E >");
	   		    }
	   		  System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah yang telah di tentukan
	   		  nilai2 = number.nextInt();
	    	  results = nilai1 * nilai2;
	   		  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	   	   	  System.out.println("----------------------------------------");
	   	  case 7:
	   	      System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai
	    	  nilai1 = number.nextInt();
	   		  if (nilai1 > 3&& nilai1 ==4) {
	   			  System.out.println("Result Task: < A >");
	   		    }
    		  else if(nilai1 > 2&& nilai1 ==3) {
    			  System.out.println("Result Task: < B >");
     		    }
    		  else if(nilai1 > 1&& nilai1 ==2) {
    			  System.out.println("Result Task: < C >");
    		    }
	    	  else if(nilai1 > 0&& nilai1 ==1) {
	   			  System.out.println("Result Task: < D >");
	   		    }
	   		  else if(nilai1 <=0) {
	    		  System.out.println("Result Task: < E >");
	    	    }
	    	  System.out.print("Credit Score: "); //Masukan SKS yang sama dengan jumlah yang telah di tentukan
	   		  nilai2 = number.nextInt();
	   		  results = nilai1 * nilai2;
	   		  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	   		  System.out.println("----------------------------------------");
    	  case 8:
	   	      System.out.print("Input Value: "); //Masukan Bobot Nilai yang sesuai 
	   		  nilai1 = number.nextInt();
	    	  if (nilai1 > 3&& nilai1 ==4) {
		   		   System.out.println("Result Task: < A >");
	   		    }
	   		  else if(nilai1 > 2&& nilai1 ==3) {
		   		  System.out.println("Result Task: < B >");
		   	    }
		   	  else if(nilai1 > 1&& nilai1 ==2) {
	    		  System.out.println("Result Task: < C >");
	    	    }
	   		  else if(nilai1 > 0&& nilai1 ==1) {
	   			  System.out.println("Result Task: < D >");
	   		    }
		      else if(nilai1 <=0) {
	   			  System.out.println("Result Task: < E >");
	     	    }
	          System.out.print("Credit Score: "); //Masukan SKS yang sesuai dengan jumlah yang telah di tentukan
	   		  nilai2 = number.nextInt();
	  		  results = nilai1 * nilai2;
	   		  System.out.println("Total Result: " + nilai1 + " X " + nilai2 + " = " + results );
	   		  System.out.println("----------------------------------------");
	   	      break;
   		  default:
	   	  System.out.println("=======================================");
	   	  System.out.println("Please Choose According to the Case.!!!");
   		  System.out.println("=======================================");
        }
		//Tampilan Nilai MAHASISWA Semester 
        System.out.print("Enter the Total Task: "); //Jumlahkan seluruh hasil yang di dapatkan pada setiap Case.1 - Case.8
        task = number.nextInt();                     //Lalu masukan hasil akhir dari penjumlahan seluruh hasil Case											
        System.out.print("Enter Quiz Grades: "); //Masukan total nilai quis jika di perlukan
        quiz = number.nextInt();
        System.out.println("Credit Score: " + SKS ); //Tampilan total SKS dari seluruh Mata kuliah
        results = task + quiz;
        System.out.println("Total Value: " + task + " + " + quiz + " = " + results );
        System.out.println("=======================================");
        System.out.print("Enter Results: "); //Masukan hasi dari penjumlahan tugas & quis
        value = number.nextDouble();
        System.out.print("Credit Score: " + SKS );
        IPS =  value / SKS;
        System.out.println();
        System.out.println("Results IPS : " + value + " / " + SKS + " = " + IPS ); //Tampilan SKS Mahasiswa
        System.out.println("=======================================");
		
		boolean inputProgram = true;
		System.out.print("Do you want to display the IPK?(Y/N): ");
		String masukanProgram = input.nextLine();
		if(masukanProgram.equalsIgnoreCase("Y")) {
			inputProgram = true;
		  //Tampilan Perhitungan untuk menentukan Nilai IPK
       	  /*Untuk Berjaga-jaga pastikan anda sudah mengulang program ini
    	   *Atau anda sudah menginput kedua kalinya.
    	   *jika tidak maka Progam tidak dapat menentukan Nilai IPK dengan benar.
    	   */
    	   System.out.println("=============================================");
    	   System.out.print("Enter the total weight of Semester.1 Score: ");
    	   task = number.nextInt();
    	   System.out.print("Enter the total weight of Semester.2 Score: ");
    	   quiz = number.nextInt();
       	   results = task + quiz;
    	   System.out.println("Total Result of the Final Semester: " + task + " + " + quiz + " = " + results );
    	   System.out.println("=============================================");
		   
		   System.out.print("Enter the total SKS of the final Semester: ");
		   task = number.nextInt();
		   System.out.print("Enter Final Semester total points: ");
		   value = number.nextDouble();
		   IPK = value / task;
		   System.out.println("Result Value IPK: " + value + " / " + task + " = " + IPK );
    	   System.out.println("=============================================");
	    }
	  
	  //Tampilan Perhitungan Nilai UTS & UAS
	  boolean valueDisplay = true;
	  System.out.print("Do you want to calculate your UTS&UAS scores?(Y/N): ");
	  String tampilanNilai = input.nextLine();
	  if(tampilanNilai.equalsIgnoreCase("Y")) {
		  valueDisplay = true;
		  
		  //Tampilan Nilai UTS MAHASISWA Semester 
	      System.out.print("Input Value UTS: ");
	      value = number.nextInt();
	      System.out.println("Credit Score: " + UTS + "%");
	      UTS = UTS /100;
	      IPS = value * UTS;
	      System.out.println("Value UTS: " + value + " X " + UTS + "%" + " = " + IPS );
	      System.out.println("=======================================");
	  
	      //Tampilan Nilai UAS MAHASISWA Semester 
	      System.out.print("Input Value UAS: ");
	      value = number.nextInt();
	      System.out.println("Credit Score: " + UAS + "%");
	      UAS = UAS /100;
	      IPS = value * UAS;
	      System.out.println("Value UAS: " + value + " X " + UAS + "%" + " = " + IPS );
	       System.out.println("=======================================");
	    }
	  //Perulangan Program Untuk Menghitung IPK
	  System.out.print("Do you want to calculate the IPK?(Y/N): ");
	  String mulaiKembali = input.nextLine();
	  if(mulaiKembali.equalsIgnoreCase("Y")) {
		  startBack = true;
	    }
	  else {
		  System.out.println("--------------------");
		  System.out.println("|>>Happy Studying<<|");
		  System.out.println("--------------------");
		  System.exit(0);
	    }
    }	
  }
}