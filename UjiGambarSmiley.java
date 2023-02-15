/**
 *@ArulVScode(Github)
 *
 *@muhasrulmulis(IG)
 *
 *Program Java Sederhana
 *Name User: Muh. Asrul Mulis
 *Date: 01/February/2023
 *
 *Version(0.9)
 */

import javax.swing.JFrame;

public class UjiGambarSmiley {
	
   public static void main(String[] args) {
      GambarSmiley panel = new GambarSmiley();
	  JFrame aplikasi = new JFrame();
	  
	  aplikasi.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	  aplikasi.add( panel );
	  aplikasi.setSize( 230, 250 );
	  aplikasi.setVisible( true );
   }
}