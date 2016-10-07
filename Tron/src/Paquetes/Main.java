package Paquetes;

import javax.swing.JFrame;

public class Main {
	
	public static Manejador Ventana = new Manejador();
	public static int largo = 600;
	public static int altura = 400;
	public static void  main(String args[]){
		
		Ventana.setSize(largo, altura);
		Ventana.setResizable(true);
		Ventana.setVisible(true);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.setTitle("Prueba 2D");
		Ventana.setLocationRelativeTo(null);
		Ventana.setAlwaysOnTop(true);
	}

} 