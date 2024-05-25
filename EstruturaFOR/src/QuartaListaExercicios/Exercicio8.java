package QuartaListaExercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Entre com um numero");
		int n = leitor.nextInt();
		int soma = 0;
		
		for(int i = 1; i < n; i++) {
			if(n%i==0) {
				System.out.println(i);
				soma+=i;
			}
			
		}
		System.out.println(soma);

	}

}
