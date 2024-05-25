package QuartaListaExercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int numeroInicial = 0;
		int diferencaUm = 2;
		
		for (int i = 1; i <=10; i++) {
			if(i == 1) {
				numeroInicial = 3;
			}
			numeroInicial += diferencaUm;
		}
		
		System.out.println(numeroInicial);
		
	}

}
