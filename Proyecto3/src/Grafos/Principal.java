package Grafos;

public class Principal {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		GeneraMatriz extrae = new GeneraMatriz();
		Object matriz = (Object) extrae.aleatoria();
		Floyd ruta = new Floyd();
		System.out.println(ruta.algoritmoFloyd((long[][]) matriz, 2, 30));
		
		GeneraMatriz extrae2 = new GeneraMatriz();
		Object matriz2 = (Object) extrae2.alActualizada((long [][]) matriz);

	}
}
