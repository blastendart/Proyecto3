package Grafos;

import java.io.*;

public class Floyd {
	//
    public String algoritmoFloyd(long [][] matriz, int x, int z){
        x -= 1;
        z -= 1;
        if (z==x && x>=0 &&  x<matriz.length && z>=0 && z<matriz.length){
        	return "De ("+(x+1)+" a "+(z+1)+") la ruta es 0";
        }
        if(x>=0 &&  x<matriz.length && z>=0 && z<matriz.length){
            int contador = matriz.length;
            long matrizAdy[][] = matriz;
            String camino[][] = new String [contador][contador];
            String caminoAux[][] = new String [contador][contador];
            String caminoRec = "", cadena="", recorrido="";
            int i, j, k;
            float temporal1, temporal2, temporal3, temporal4, minimo;
            ////////////////////////////////////
            for(i=0;i<contador;i++){
                for(j=0;j<contador;j++){
                    camino[i][j]="";
                    caminoAux[i][j]="";
                }
            }
            for (k=0;k<contador;k++){
                for (i=0;i<contador;i++){
                    for (j=0;j<contador;j++){
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
             /*for(i=0;i<vertices;i++){
                for(j=0;j<vertices;j++){
                    cadena=cadena+"["+matrizAdy[i][j]+"]";
                }
                cadena=cadena+"\n";
            } */
            ///////////////////////////////////////
            //for(i=0;i<vertices;i++){
            while(x<x+1){
                while(z<z+1){
                    if (matrizAdy[x][z]!=1000000000){
                        if (x != z){
                            if (camino[x][z].equals("")){
                                    recorrido+="De ("+(x+1)+" a "+(z+1)+") la ruta es ("+(x+1)+", "+(z+1)+")\n";
                            }else {
                                    recorrido+="De ("+(x+1)+" a "+(z+1)+") la ruta es ("+(x+1)+", "+camino[x][z]+", "+(z+1)+")\n";

                            }
                        }
                    }
                break;
                }
            break;
            }
            return recorrido;            
        }
        else{
        System.out.println("El usurio o destino solicitado no se encuentra en la lista");
        }
    return "";
    }
    public String caminoRecursivo(int i, int j, String[][] caminoAux, String caminoRec){
        if(caminoAux[i][j].equals("")){
            return "";
        }else{
            ///////////////
        	caminoRec += caminoRecursivo(i, Integer.parseInt(caminoAux[i][j].toString()), caminoAux, caminoRec)+(Integer.parseInt(caminoAux[i][j].toString())+1)+", ";
        	return caminoRec;
        }
    }
} 
