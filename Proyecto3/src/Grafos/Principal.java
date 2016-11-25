package Grafos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long MatrizA[][]={{0,3,4,999999999,8,999999999},{999999999,0,999999999,999999999,5,999999999},{999999999,999999999,0,999999999,3,999999999},{999999999,999999999,999999999,0,999999999,999999999},{999999999,999999999,999999999,7,0,3},{999999999,999999999,999999999,2,999999999,0}};;
		Floyd ruta=new Floyd();
		System.out.println(ruta.algoritmoFloyd(MatrizA));
	}

}
