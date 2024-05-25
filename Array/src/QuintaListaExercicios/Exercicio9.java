package QuintaListaExercicios;

import java.util.Random;

public class Exercicio9 {

	public static void main(String[] args) {
//		Criar um programa que irá imprimir a potência de 2 dos números presentes em um
//		array já preenchido com 5 números do tipo int. Para o array [2,4,5,2,-1] a saída será: 4
//		16 25 4 1
		
		int [] vetor = new int [5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = new Random().nextInt(10);
			int num = vetor[i];
			int potencia =  num*num;
			System.out.println("numero: "+vetor[i]+ " >>> potencia de 2: "+potencia);
		}


	}

}
