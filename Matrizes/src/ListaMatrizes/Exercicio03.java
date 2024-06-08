package ListaMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 3. Criar um programa que irá ler uma matriz NXM (N e M informados pelo
		 * usuário) e em seguida deve imprimir esta matriz (preencher de forma
		 * aleatória). 
		 * Na sequência, deverá ler dois valores X1/Y1 e X2/Y2 quaisquer
		 * correspondentes a duas posições na matriz. Ao final, o programa deverá
		 * escrever a soma dos valores encontrados nas respectivas posições.
		 */
		Scanner coisa = new Scanner(System.in);
		
		int soma = 0;
		System.out.println("entre com a quantidade de linhas da sua matriz");
		int linhas = coisa.nextInt();
		System.out.println("entre com a quantidade de colunas da sua matriz");
		int colunas = coisa.nextInt();
		int [][] matriz = new int [linhas][colunas];
		System.out.println();

		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(10);
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("entre com a PRIMEIRA posição LINHA "); 
		int pLinhaUm = coisa.nextInt(); 
		System.out.println("entre com a PRIMEIRA posição COLUNA: "); 
		int pColunaUm = coisa.nextInt();
		
		System.out.println("entre com a SEGUNDA posição LINHA "); 
		int pLinhaDois = coisa.nextInt(); 
		System.out.println("entre com a SEGUNDA posição COLUNA: "); 
		int pColunaDois = coisa.nextInt();
		
		int p1 = matriz[pLinhaUm][pColunaUm];
		int p2 =  + matriz[pLinhaDois][pColunaDois];
		soma = p1+p2;
		
		
		
		System.out.println("soma: "+soma);
		
		
	}
	

}
