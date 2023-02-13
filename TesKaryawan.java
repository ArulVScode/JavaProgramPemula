/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Array Java Sederhana(Package)
 *
 *Name: Muh. Asrul Mulis
 *Date: 13/February/2003
 *
 *Version(0.7)
 */

import java.io.*;

public class TesKaryawan {
	public static void main(String args[]) {
		Karyawan karSatu = new Karyawan("Muh renaldi");
        Karyawan karDua  = new Karyawan("Muh Nur Rizki");
        System.out.println("===========================");
        karSatu.umurKar(21);
        karSatu.posKar("Senior Jurnalistik");
        karSatu.gajiKar(10000000);
        karSatu.tampilKar();
        System.out.println("===========================");
        System.out.println("PEREKRUTAN KARYAWAN SENIOR");
        System.out.println("===========================");
        karDua.umurKar(20);
        karDua.posKar("Senior Design CorelDraw(CD)");
        karDua.gajiKar(5000000);
        karDua.tampilKar();
		System.out.println("===========================");
	}
}