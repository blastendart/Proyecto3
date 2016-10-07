package Paquetes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class keying extends JPanel{
 
	public Rectangle character;
 
	public int charW = 25;
	public int charH = 25;
 
	public boolean right = false;
	public boolean left = false;
	public boolean down = false;
	public boolean up = false;

	private Image img;

	public keying(display f, images i){
		character = new Rectangle(200, 200, charW, charH );
  
		f.addKeyListener(new KeyAdapter(){
   
	public void keyPressed(KeyEvent e){
	   if(e.getKeyCode() == KeyEvent.VK_D){
		   right = true;
	   }
	   if(e.getKeyCode() == KeyEvent.VK_A){
		   left = true;
	   }
	   if(e.getKeyCode() == KeyEvent.VK_W){
		   up = true;
       	}
	   if(e.getKeyCode() == KeyEvent.VK_S){
		   down = true;
	   }
	}
  
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_D){
			right = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_A){
			left = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_W){
			up = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_S){
			down = false;
		}
	}
  });  
  
 }
	

	public void paintComponent (Graphics g){
	 
		Image img11 = new ImageIcon(getClass().getResource("/Archivos/moto1.1.png")).getImage();
		Image img12 = new ImageIcon(getClass().getResource("/Archivos/moto1.2.png")).getImage();
		Image img13 = new ImageIcon(getClass().getResource("/Archivos/moto1.3.png")).getImage();
		Image img14 = new ImageIcon(getClass().getResource("/Archivos/moto1.4.png")).getImage();
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		//g.setColor(Color.BLACK);
		//g.fillRect(character.x, character.y, character.width, character.height);
		g.drawImage(img, character.x, character.y, this);
		
	if(right){
		img = img13;
		//g.drawImage(img13, character.x, character.y, this);
		character.x += 1;
	}
	if(left){
		img = img14;
		//g.drawImage(img14, character.x, character.y, this);
		character.x -= 1;
	}
	if(up){
		img = img11;
		//g.drawImage(img11, character.x, character.y, this);
		character.y -= 1;
	}
	if(down){
		img = img12;  
		//g.drawImage(img12, character.x, character.y, this);
		character.y += 1;
	}
	repaint();
 }


}
