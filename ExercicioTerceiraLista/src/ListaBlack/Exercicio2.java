package ListaBlack;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		//2.	Criar um programa que irá ler um número inteiro (N>=1) e imprimir todos os quadrados de 1 até N-1
		
		Scanner teclado = new Scanner(System.in);
		int a = 1;
		System.out.println("Entre com um numero");
		int num = teclado.nextInt();
		while(a < num) {
			int quadrado = a*a;
			System.out.println(quadrado);
			a++;

		}
		
	}

}
