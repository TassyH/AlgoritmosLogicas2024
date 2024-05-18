package QuartaListaExercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
	//	4.	Criar um programa que irá ler N números e calcular a média dos números digitados (apenas se eles forem pares).
		
		int divisor = 0;
		int soma = 0;
		int impar = 0;
		int par = 0;
		double media = 0;
		Scanner leitor = new Scanner(System.in);
		System.out.println("entre com um numero");
		int loop  = leitor.nextInt();
		
		for(int i = 1; i <=loop; i++) {
			int numero  = leitor.nextInt();
			
			if(numero%2==0) {
				par = numero+par;
				divisor = i;
				media = par/divisor;
				//System.out.println(divisor);
			}

		}
		System.out.println("soma pares "+par);
		System.out.println("a média dos numeros pares é "+media);


	}

}
