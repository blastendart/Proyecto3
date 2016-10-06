package Paquetes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JPanel implements ActionListener, KeyListener{
	Timer tiempo = new Timer(20, this);
	int PosX= 0, PosY = 0, VelX = 0, VelY = 0;
	
	public Main(){
		tiempo.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	
	public void init() {}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillRect(PosX, PosY, 50, 45);
	}
	

	//public void KeyReleased(KeyEvent e){}
	//public void KeyTyped(KeyEvent e){}
	
	
	public void actionPerfomed(ActionEvent e){
		
		PosX = PosX + VelX;
		PosY = PosY + VelY;
		repaint();
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int b = e.getKeyCode();
		
		if (b == KeyEvent.VK_LEFT){
			VelX = -1;
			VelY = 0;
		}
		if (b == KeyEvent.VK_UP){
			VelX = 0;
			VelY = -1;
		}
		if (b == KeyEvent.VK_RIGHT){
			VelX = 1;
			VelY = 0;
		}
		if(b == KeyEvent.VK_DOWN){
			VelX = 0;
			VelY = 1;	
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub	
	}
	
	public static void main(String[] arg){
	
		Main ver = new Main();
		JFrame Ventana = new JFrame();
		Ventana.setTitle("Pruebas con Movimiento");
		Ventana.setSize(400, 400);
		Ventana.setVisible(true);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.add(ver);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
