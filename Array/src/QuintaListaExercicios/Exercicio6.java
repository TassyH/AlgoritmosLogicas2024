package QuintaListaExercicios;

public class Exercicio6 {

	public static void main(String[] args) {

//		6 - Criar um programa que irá popular (comando for, while ou do while) um array de
//		inteiros com 10 posições. O resultado final deve ser: 10 20 30 40 50 60 70 80 90 100.
//		O programa deverá também imprimir o resultado.
		
		int [] vetor = new int [11];
		
		for (int i = 1; i < vetor.length; i++) {
			int posicoes = vetor[i] = i*10;
			System.out.println(posicoes);
		}
	}

}
