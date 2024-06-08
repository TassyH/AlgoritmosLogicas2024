package ListaMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Criar um programa que irá somar todos os valores pares de uma matriz(NXM).
		 * Preencher a matriz com números aleatórios (até 10). O programa deverá
		 * imprimir a matriz e a soma dos pares
		 */
		
        Scanner coisa = new Scanner(System.in);
        int numeroAleatorio = 0;
		
		int somaPar = 0;
		System.out.println("entre com a quantidade de linhas da sua matriz");
		int linhas = coisa.nextInt();
		System.out.println("entre com a quantidade de colunas da sua matriz");
		int colunas = coisa.nextInt();
		int [][] matriz = new int [linhas][colunas];
		System.out.println();

		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				numeroAleatorio = new Random().nextInt(10);
				matriz[i][j] = numeroAleatorio;
				System.out.print(matriz[i][j]+" ");
				if(numeroAleatorio/2==0) {
					int par = numeroAleatorio;
					somaPar = numeroAleatorio + somaPar;
				}
			}
			System.out.println();
		}
		
		System.out.println(somaPar);
	}

}
