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

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GambarSmiley extends JPanel {

  public void paintComponent(Graphics g) {
     super.paintComponent(g);
	 
	 //menggambar wajah
	 g.setColor(Color.YELLOW);
	 g.fillOval(10, 10, 200, 200);
	 
	 //menggambar mata
	 g.setColor(Color.BLACK);
	 g.fillOval(55, 65, 30, 30);
	 g.fillOval(135, 65, 30, 30);
	 
	 //menggambar mulut
	 g.fillOval(50, 110, 120, 60);
	 
	 //membentuk Senyuman
	 g.setColor(Color.YELLOW);
	 g.fillRect(50, 110, 120, 30);
	 g.fillOval(50, 120, 120, 40);
  }
}