package ListaBlack;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 6. Criar um programa que irá ler um número inteiro (N>=1) e imprimir todos os
		 * divisores de N e também a soma dos divisores. Ex: para N==10, os divisores
		 * são 1,2,5,10 e a soma igual a 18.
		 */	
        Scanner teclado = new Scanner(System.in);
		int a = 1;
		int contador = 0;
		System.out.println("Entre com um numero");
		int numero = teclado.nextInt(); 
		System.out.println("-------------------------------");
		
		while(a <= numero) {
			
			if(numero%a==0) {
				contador = contador+a;
			   System.out.println(a);
			}
			a++;
			
		}
		System.out.println(contador);
		
	}

}
