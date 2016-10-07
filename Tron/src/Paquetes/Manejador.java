package Paquetes;

import javax.swing.*;
import java.awt.*;

public class Manejador extends JFrame{
	public JPanel JP = (JPanel) getGlassPane();
	public Objetos O;
	public Moto M;
 
	public Manejador(){
		O= new Objetos();
		JP.setVisible(true);
		M = new Moto(this, O);
  
		JP.setLayout(new GridLayout(1,1,0,0));
		this.setLayout(new GridLayout(1,1,0,0));
  
	JP.add(M);
	this.add(O);
 }
}