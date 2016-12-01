package Grafos;

import java.util.Random;

public class GeneraMatriz{

	public Object aleatoria(){
		
		long Matriz[][] = new long [30][30];
		int i = 0;
		int j = 0;
		//System.out.println("{");
		while (j<30){
			//System.out.println(",{");
			while(i<30){
				if (i == j){
					
					Matriz[i][j] = 0;
					//System.out.print(Matriz[i][j]+",");
					i += 1;
				}
				else{
					Random rnd1 = new Random();
					int rand1 = (int)(rnd1.nextDouble() * 15 + 1);
					if (rand1 == 1 || rand1 == 2){
						Random rnd2 = new Random();
						int rand2 = (int)(rnd2.nextDouble() * 30 + 1);
						Matriz[i][j] = rand2;
						//System.out.print(Matriz[i][j]+",");
						i += 1;
					}
					else{
						Matriz[i][j] = 999999999;
						//System.out.print(Matriz[i][j]+",");
						i += 1;
					}
				}
			}
			//System.out.print("},");
			i = 0;
			j += 1;
	}
		//System.out.println("}");
		return Matriz;
	}
	
	public Object nuevoNodo(){
		
		int j = 31;
		int info[] = new int [j];
		int i = 0;

		
		while (i<j){
				
			if (i == j-1){
				
				info[i] = 0;
				System.out.print(info[i]+", ");
				i += 1;
			}
			else{
				Random rnd1 = new Random();
				int rand1 = (int)(rnd1.nextDouble() * 15 + 1);
				if (rand1 == 1 || rand1 == 2){
					Random rnd2 = new Random();
					int rand2 = (int)(rnd2.nextDouble() * 30 + 1);
					info[i] = rand2;
					System.out.print(info[i]+", ");
					i += 1;
				}
				else{
					info[i] = -1;
					System.out.print(info[i]+", ");
					i += 1;
				}
			}
		}


		return info;
	}
}
