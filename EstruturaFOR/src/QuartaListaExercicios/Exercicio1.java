package QuartaListaExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//1.	Criar um programa que irá ler um número inteiro (N>=1) e imprimir todos os números inteiros entre 1...N e a soma destes números.
		int soma = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("entre com um numero");
		int num  = leitor.nextInt();
		
		for(int i = 1; i<=num; i++) {
			
			soma = soma+i;
			System.out.println(i);
		}
		System.out.println("soma dos numeros: "+soma);
	}

}
