package Paquetes;
		
public class Crono{ 
	
		public static int segundos = 0; //se inicializa una variable para los segundos
	
		public static int temporizador(){ //se crea el método static int pues devolverá un entero(segundos)
			
	    for (segundos= 0; segundos < 10; segundos ++) //Un ciclo de crecimiento estandar para segundos
	    {
	    // System.out.println(segundos); //nada 
	    cuentaSegundos(); //el método que estará dando el tiempo real en el ciclo 
	 
	    }  
		return segundos; //se retorna la variable segundos para ser utilizada en fututos métodos
	    }
	
	       

	private static void cuentaSegundos(){ //
	    try{
	    Thread.sleep(1000);
	    }
	    catch(Exception e){}
		
	}
}
