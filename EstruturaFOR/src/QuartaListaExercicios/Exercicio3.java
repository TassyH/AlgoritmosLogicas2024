package QuartaListaExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		//3.	Criar um programa que irá ler N números do teclado e informar qual deles foi o maior e o menor.
		int maior = 0;
		int menor = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("entre com um numero");
		int loop  = leitor.nextInt();
		
		for(int i = 1; i <=loop; i++) {
			
			int numero = leitor.nextInt();
			
		
			
			if(maior < numero) {
				maior = numero;
			}else {
				menor = numero;
			}
		}
		
		if(maior > menor) {
			System.out.println(maior + " é o maior");
			System.out.println(menor + " é o menor");
		
		}
		}

	}


