package Paquetes;

import java.awt.event.*;

public class Apoderes {

	boolean inmune = false; //variable que deteminará si el poder Escudo está activo
	boolean veloz = false; //variable para cuando el poder Velocidad está activo
	static GenericList<Integer> Poderes = new GenericList<Integer>();
	
	public static void activacion(){
		
		//Pila configurada para ser Pila que recibe los poderes al momento de que la moto pase sobre ellos

		Poderes.insertarAlFrente(Escudo.cogePoder());
	}
	
	//Caso para cuando se activa el último poder de la cola con la letra E.
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_E){
			if (Poderes.search() == 1){
				inmune = true;
			}
			if (Poderes.search() == 0){
				veloz = true;
			}
		}
	}
	  
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode() == KeyEvent.VK_E){
			inmune = false;
		}
	}
	
} 