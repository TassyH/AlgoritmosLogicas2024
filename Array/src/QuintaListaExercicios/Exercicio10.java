package QuintaListaExercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

//		10.Criar um programa que irá perguntar ao usuário a quantidade de números que será
//		lido.
//		Após essa leitura, o programa deverá construir e inicializar um array com N posições.
//		O programa ainda deverá perguntar N vezes ao usuário para digitar um número. Cada
//		número digitado deverá preencher uma posição do array. Ao final, o programa deverá
//		imprimir o array.
		Scanner leitor = new Scanner (System.in);
		int posicoes = 0;
		System.out.println("entre com a quantidade de numero que será lido");
		int qtdd = leitor.nextInt();
		
		int [] vetor = new int [qtdd];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		
			System.out.println("--- digite o valor da posiçao "+vetor[i]+" do vertor:");
			int num  = leitor.nextInt();
			vetor[i] = num;
			
					
			
			
		}
		System.out.println(posicoes);


	}

}
