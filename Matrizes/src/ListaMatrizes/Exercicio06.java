package ListaMatrizes;

import java.util.Random;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Criar um programa que irá gerar uma matriz 3X3 e preencher as posições com os
		 * 9 primeiros números impares. Na sequência, imprima a matriz.
		 */
		int[][] matriz = new int[3][3];
		int numAleatorio = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				numAleatorio = new Random().nextInt(10);
				if(numAleatorio%2 != 0) {
				  matriz[i][j] = numAleatorio;
				}
				
				System.out.print(matriz[i][j] + " ");

			}
			System.out.println("");
		}

	

	}

}
