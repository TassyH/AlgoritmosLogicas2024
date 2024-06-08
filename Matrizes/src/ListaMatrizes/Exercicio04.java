package ListaMatrizes;

import java.util.Random;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Criar um programa que irá popular uma matriz 3X3 e depois deverá: 
		 * ● Imprimir
		 * a matriz; 
		 * ● Atribuir valor 0 para todos os elementos menores que 5; 
		 * ●Imprimir a matriz novamente.
		 */
		
		int [][] matriz = new int [3][3];
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
		
		System.out.println("---------");
		
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
