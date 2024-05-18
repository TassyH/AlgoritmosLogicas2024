package ListaBlack;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int numero = teclado.nextInt(); 
		System.out.println("-------------------------------");
		int a = 1;
		int fatorial = 1;

	        while (numero >= 1) {
	            fatorial = fatorial* numero;
	            System.out.println( numero--);
		}
		System.out.println(fatorial);
		
		
		
			
	}

}
