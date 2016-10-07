package Paquetes;


import javax.swing.*;
import java.awt.*;

public class display extends JFrame{
 public JPanel gp = (JPanel) getGlassPane();
 public images i;
 public keying k;
 
 public display(){
  i= new images();
  gp.setVisible(true);
  k = new keying(this, i);
  
  gp.setLayout(new GridLayout(1,1,0,0));
  this.setLayout(new GridLayout(1,1,0,0));
  
  gp.add(k);
  this.add(i);
 }
}