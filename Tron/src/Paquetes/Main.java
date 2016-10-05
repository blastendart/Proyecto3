package Paquetes;

import java.io.ObjectInputStream.GetField;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cont = Crono.temporizador();
		System.out.println(cont); 
		
		
		//Pila que recibe los poderes al momento de que la moto pase sobre ellos
		Stack PilaPoderes = new Stack();
		//PilaPoderes.push(Velocidad.velocidadAct());
		PilaPoderes.push(Escudo.escudoAct());
		System.out.println(PilaPoderes.pop());
		//System.out.println(PilaPoderes.pop());
		
		int PosGeneral = Velocidad.getPosM();
		 
		
	}

}
