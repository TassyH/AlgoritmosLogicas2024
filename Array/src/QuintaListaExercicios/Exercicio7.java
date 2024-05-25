package QuintaListaExercicios;

public class Exercicio7 {

	public static void main(String[] args) {

//		7. Criar um programa que irá popular (comando for, while ou do while) apenas com
//		números pares um array de inteiros com 100 posições. O resultado final deve ser: 2 4
//		6 8 .... O programa deverá também imprimir o resultado.
		
		int [] vetor = new int [100];
		
		for (int i = 0; i < vetor.length; i++) {
			if(i%2 == 0 && i > 0) {
				System.out.println(vetor[i] = i);
			}
		}
		
	}

}
