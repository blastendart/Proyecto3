package Grafos;

import java.io.*;

public class Floyd {

static int [ ][ ]floyd;

static BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));

public static void main() {

int n=0;

try {

System.out.print("Ingrese n (tamaño de la matriz n X n) : ");

n=Integer.parseInt(leer.readLine());

floyd=new int[n][n];

for (int i=0;i<n;i++)

for (int j=0;j<n;j++)

{

System.out.println("Inserte la componente W(" + i + ")(" + j +")");

floyd[i][j]=Integer.parseInt(leer.readLine());

}

}

catch(Exception e){}

for (int k=0;k<=n-1;k++)

{

for (int i=0;i<=n-1;i++)

{for (int j=0;j<=n-1;j++)

if ((floyd[i][k]!=-1)&&(floyd[k][j]!=-1))

floyd[i][j]=funcionfloyd(floyd[i][j],floyd[i][k]+floyd[k][j]);}

}

System.out.println("Matriz de adyacencia correspondiente: ");

for (int i=0;i<n;i++)

{

for (int j=0;j<n;j++)

System.out.print(" – "+floyd[i][j]);

System.out.println();

}

}

public static int funcionfloyd(int A, int B)

{

if ((A==-1)&&(B==-1))

return -1;

else if (A==-1)

return B;

else if (B==-1)

return A;

else if (A>B)

return B;

else return A;

}      
}

/*public class Floyd {
	//
	public String algoritmoFloyd(long [][] mAdy){
		int vertices = mAdy.length;
		long MatrizAdy[] [] = mAdy;
		String camino[][] = new String[vertices][vertices];
		String caminoAux[][] = new String[vertices][vertices];
		String caminoRec= "", cadena="",recorrido="";
		int i,j,k;
		float temporal1, temporal2, temporal3, temporal4, minimo;
		//Se inicializaron las variables que se necesitarán.
		for(i=0;i<vertices;i++){
			for(j=0;j<vertices;j++){
				camino[i][j]="";
				caminoAux[i][j]="";
			}
		}
		for(k=0;k<vertices;k++){
			for(i=0;i<vertices;i++){
				for(j=0;j<vertices;j++){
					temporal1 = MatrizAdy[i][j];
					temporal2 = MatrizAdy[i][k];
					temporal3 = MatrizAdy[k][j];
					temporal4 = temporal2+temporal3;
					//Hallar el mejor camino
					minimo=Math.min(temporal1, temporal4);
					if(temporal1!=temporal4){
						if(minimo==temporal4){
							caminoRec="";
							caminoAux[i][k]=k+"";
							camino[i][j]=caminoRecursivo(i,k,caminoAux,caminoRec) + (k+1);
						}
					}
					MatrizAdy[i][j]=(long) minimo;
				}
			}
		}
		//Se agrega el camino más corto a cadena
		for(i=0;i<vertices;i++){
			for(j=0;j<vertices;j++){
				cadena = cadena+"["+MatrizAdy[i][j]+"]";
			}
		cadena=cadena+"\n";
		}
		//////////////////////////////////////////
		for(i=0;i<vertices;i++){
			for(j=0;j<vertices;j++){
				if(MatrizAdy[i][j]!=1000000000){
					if(i!=j){
						if(camino[i][j].equals("")){
							recorrido+="De "+(i+1)+" a "+(j+1)+" La ruta es: "+(i+1)+", "+(j+1)+"\n";
						}
						else{
							recorrido+="De "+(i+1)+" a "+(j+1)+" La ruta es: "+(i+1)+", "+camino[i][j]+", "+(j+1)+"\n";
						}
					}
				}
			}
		}
		return "La Matriz que ha resultado es: \n"+cadena+"\nLos caminos son\n"+recorrido;
	}
	public String caminoRecursivo(int i, int k, String[][] caminoAux, String caminoRec){
		if(caminoAux[i][k].equals("")){
			return "";
		}
		else{
			//Creación del recorrido
			caminoRec+=caminoRecursivo(i, Integer.parseInt(caminoAux[i][k].toString()), caminoAux, caminoRec)+(Integer.parseInt(caminoAux[i][k].toString())+1)+", ";
			return caminoRec;
		}
	}
} */
