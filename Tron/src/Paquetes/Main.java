package Paquetes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

public class Main {
	
	public static Manejador Ventana = new Manejador();
	public static int largo = 630;
	public static int altura = 450;
	public static void  main(String args[]){
		
		Ventana.setSize(largo, altura);
		Ventana.setResizable(true);
		Ventana.setVisible(true);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.setTitle("Prueba 2D");
		Ventana.setLocationRelativeTo(null);
		Ventana.setAlwaysOnTop(true);
		
		
		while (true){
		System.out.println(Moto.getposX());
		
		System.out.println(Moto.getposY());
		}
	}

} 