package Paquetes;
		
public class Crono{ 
	
		public static int segundos = 0;
	
		public static int temporizador(){
			
	    for (segundos= 0; segundos < 10; segundos ++)
	    {
	    System.out.println(segundos); //tentativo cambio de boolean 
	    cuentaSegundos();
	 
	     
	    }  
		return segundos;
	    }
	
	       

	private static void cuentaSegundos(){      
	    try{
	    Thread.sleep(1000);
	    }
	    catch(Exception e){}
		
	}
}
