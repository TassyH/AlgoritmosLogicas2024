package AulasMatrizes;

import java.util.Random;

public class ExercicioAula01 {

	public static void main(String[] args) {
		
		int [][] matriz = new int [3][4];
		int qtdSete = 0;
		
		for (int i = 0; i<matriz.length; i++) { //quantidade de linhas da matriz
			for (int j = 0; j < matriz[i].length; j++) { // quantidade de colunas. Esse for só vai parar quando popular todas as colunas dessa linha, daí ele passa para a proxima linha
				matriz[i][j] = new Random().nextInt(10);
				if (matriz[i][j] == 7) {
					qtdSete++;
				}
			}
		}
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	
		System.out.println("quantidade de sete: "+qtdSete);
		
		
	}

}
