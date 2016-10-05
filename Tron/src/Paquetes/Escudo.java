package Paquetes;


public class Escudo {

	boolean inmune = false;
	static int posE = 0;
	static int posV = 0;
	static int posM = 0;
	
	
	public static int escudoAct(){
		if (posE == posM){
			return 0; }
		if (posV == posM){
			return 1; }
		else{
			return 2; }
	}	
	
	
	public static int getPosE() {
		return posE;
	}

	public static void setPosE(int posE) {
		Escudo.posE = posE;
	}

	public static int getPosM() {
		return posM;
	}

	public static void setPosM(int posM) {
		Escudo.posM = posM;
	}				
	
	public static int getPosV() {
		return posV;
	}

	public static void setPosV(int posV) {
		Velocidad.posV = posV;
	}
	
	/*public void escudoAct1(){
	
	int cont = Crono.temporizador();
	while (cont < 5);{
		inmune = true;
		}
	} */
}
		


