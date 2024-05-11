package ListaBlack;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		//1.	Criar um programa que irá ler um número inteiro (N>=1) e imprimir todos os números inteiros entre 1...N e a soma destes números.
		Scanner teclado = new Scanner(System.in);
		int a = 0;
		int soma = 0;
		System.out.println("Entre com um numero");
		int num = teclado.nextInt();
		while(a <= num) {
			
			soma = soma +a;
			System.out.println("loop: "+a);
			a++;
		}
		System.out.println(soma);

		
	}

}
