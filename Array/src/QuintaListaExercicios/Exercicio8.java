package QuintaListaExercicios;

import java.util.Random;

public class Exercicio8 {

	public static void main(String[] args) {

//		Criar um programa que irá calcular a média aritmética de um array já preenchido com
//		5 números do tipo float
		int soma = 0;
		double media = 0;
		int vetor [] = new int [5];
		
		for (int i = 1; i < vetor.length; i++) {
			vetor[i] = new Random().nextInt(20);
			System.out.println(vetor[i]);
			soma = soma + vetor[i];
			media = soma/i;
		}
		System.out.println("soma dos numeros gerados: "+soma);
		System.out.println("media: "+media);
		
	}

}
