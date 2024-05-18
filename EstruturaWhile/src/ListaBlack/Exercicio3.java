package ListaBlack;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		//3.	Criar um programa que irá ler N números do teclado e informar qual deles foi o maior e o menor.

		
				Scanner teclado = new Scanner(System.in);
				int a = 0;
				int num =0;
			    int maior = 0;
			    int menor = 0;
				System.out.println("Entre com um numero");
				int loopNum = teclado.nextInt(); 
				System.out.println("-------------------------------");

				while(a < loopNum) {
					num  = teclado.nextInt();
					
					if (a==1) {
						maior = num;
					}
					if(maior < num) {
						maior = num;
					}else {
						menor = num;
					}
					
					a++;
				
				}		    
				//System.out.println(maior+ " é o maior");
				System.out.println(maior+ " é maior");

	}
}
