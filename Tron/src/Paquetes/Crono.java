package Paquetes;
		
public class Crono{ 
	
		public static int segundos = 0;
	
		public static int temporizador(){
			
	    for (segundos= 0; segundos < 6; segundos ++)
	    {
	    cuentaSegundos();
	    //return segundos;
	     
	    } 
	    //System.out.println("Listos"); //tentativo cambio de boolean 
		return segundos;
	    }
	
	       

	private static void cuentaSegundos(){      
	    try{
	    Thread.sleep(1000);
	    }
	    catch(Exception e){}
		
	}
}
