package QuintaListaExercicios;

import java.util.Random;

public class ExercicioXP {

	public static void main(String[] args) {

//		Criar um programa que irá:
//			● Criar um array com 10 posições;
//			● Popular com números aleatórios (int).
//			● Imprimir o array (os números devem estar em uma única linha)
//			● Para cada número ímpar, substituir com o próximo número par.
//			● Imprimir o array (os números devem estar em uma única linha)
		
        int [] vetor = new int [10];
		int vetorImpar = 0;
		for (int i = 1; i < vetor.length; i++) {
			vetor[i] = new Random().nextInt(31);
			System.out.print(" "+vetor[i]);
			
//			if(vetor[i]%i!=0) {
//				for(int a = 1; a < vetor[i]; a++ ) {
//					vetorImpar = vetor[i]+1;
//					System.out.print(" "+vetor[i]);
//				}
//			}
			
			}
		}
		
	}


