package AulaArray;

import java.util.Random;

public class PrimeiroArray {

	public static void main(String[] args) {

		int [] vetor = new int [5];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = new Random().nextInt(100);
		}
		
		for(int i = 0; i <vetor.length; i++) {
			System.out.println(+vetor[i]);
		}
	}

}
