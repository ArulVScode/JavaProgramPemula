import java.io.*;

public class Karyawan {
   String nama;
   int umur;
   String posisi;
   int gaji;
   
   public Karyawan(String nama) {
      this.nama = nama;
   }
   
   public void umurKar(int umurKar) {
      umur = umurKar;
   }
   
   public void posKar(String posKar) {
      posisi = posKar;
   }
   
   public void gajiKar(int gajiKar) {
      gaji = gajiKar;
   }
   
   public void tampilKar() {
      System.out.println("Nama   : "+ nama);
	  System.out.println("Umur   : "+ umur);
	  System.out.println("Posisi : "+ posisi);
	  System.out.println("Gaji   : "+ gaji);
   }
}