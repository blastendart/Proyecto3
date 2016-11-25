package Grafos;

public class Floyd {
	//
	public String algoritmoFloyd(long [][] MatrizP){
		int vertices = MatrizP.length;
		long MatrizAdy[] [] = MatrizP;
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
		cadena+="\n";
		}
		//////////////////////////////////////////77
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
		return "La Matriz que ha resultado es: \n"+cadena+
				"\nLos caminos son\n"+recorrido;
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
}
