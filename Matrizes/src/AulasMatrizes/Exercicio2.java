package AulasMatrizes;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][4];
		int qtd = 0;
		
		for (int i = 0; i<matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) { 
				matriz[i][j] = new Random().nextInt(10);
			
			}
		}
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------- welcome to the matrix revolution 	'---------");
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] >= 5) {
					matriz[i][j] = 1;
				}else {
					matriz[i][j] = 0;

				}
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	

	}

}
