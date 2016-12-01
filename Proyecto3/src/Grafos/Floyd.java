package Grafos;

import java.io.*;

public class Floyd {
	//
    public String algoritmoFloyd(long [][] matriz){
        int vertices = matriz.length;
        long matrizAdy[][] = matriz;
        String camino[][] = new String [vertices][vertices];
        String caminoAux[][] = new String [vertices][vertices];
        String caminoRec = "", cadena="", recorrido="";
        int i, j, k;
        float temporal1, temporal2, temporal3, temporal4, minimo;
        ////////////////////////////////////
        for(i=0;i<vertices;i++){
            for(j=0;j<vertices;j++){
                camino[i][j]="";
                caminoAux[i][j]="";
            }
        }
        for (k=0;k<vertices;k++){
            for (i=0;i<vertices;i++){
                for (j=0;j<vertices;j++){
                    temporal1 = matrizAdy[i][j];
                    temporal2 = matrizAdy[i][k];
                    temporal3 = matrizAdy[k][j];
                    temporal4 = temporal2+temporal3;
                    ////////////////////
                    minimo = Math.min(temporal1, temporal4);
                    if (temporal1 != temporal4){
                        if (minimo == temporal4){
                        	caminoRec = "";
                        	caminoAux[i][j]=k+"";
                            camino[i][j]=caminoRecursivo(i, k, caminoAux, caminoRec)+(k+1);
                        }
                    }
                    matrizAdy[i][j]=(long)minimo;
                }
            }
        }
        //////////////////////
         for(i=0;i<vertices;i++){
            for(j=0;j<vertices;j++){
                cadena=cadena+"["+matrizAdy[i][j]+"]";
            }
            cadena=cadena+"\n";
        }
        ///////////////////////////////////////
        for(i=0;i<vertices;i++){
            for(j=0;j<vertices;j++){
                if (matrizAdy[i][j]!=1000000000){
                    if (i != j){
                        if (camino[i][j].equals("")){
                        	recorrido+="De ("+(i+1)+"--->"+(j+1)+") Irse por ...("+(i+1)+", "+(j+1)+")\n";
                        }else {
                        	recorrido+="De ("+(i+1)+"--->"+(j+1)+") Irse por..("+(i+1)+", "+camino[i][j]+", "+(j+1)+")\n";
                            
                        }
                    }
                }
            }
        }
        return recorrido;
    }
    public String caminoRecursivo(int i, int k, String[][] caminoAux, String caminoRec){
        if(caminoAux[i][k].equals("")){
            return "";
        }else{
            ///////////////
        	caminoRec += caminoRecursivo(i, Integer.parseInt(caminoAux[i][k].toString()), caminoAux, caminoRec)+(Integer.parseInt(caminoAux[i][k].toString())+1)+", ";
            return caminoRec;
        }
    }
} 
