package TRABALHO_2_BIMESTRE;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01trabalho {

	public static void main(String[] args) {

		/*
		 * [1,0] Criar um programa para gerar um número aleatório entre 1 e 15.
		 * Pesquisem por new Random().nextInt(informe um número aqui). Este número
		 * aleatório não deve ser mostrado para o usuário. Na sequência o usuário irá
		 * informar valores até acertar o número gerado aleatoriamente. Se o número
		 * informado pelo usuário for menor que o número aleatório gerado, o programa
		 * deve informar “número pequeno”. Se o número informado pelo usuário for maior
		 * que o número aleatório gerado, o programa deve informar “número grande”.
		 * Obrigatoriamente deverá ser utilizado o comando FOR ou WHILE.
		 */
		boolean acertou = false;
		Scanner leitor = new Scanner(System.in);
		int numRandom = new Random().nextInt(1,15);
		System.out.println(numRandom);
		
			while (acertou == false) {
				System.out.println("de seu palpite do numero: ");
				int chute = leitor.nextInt();
				if(chute < numRandom) {
					System.out.println("Vc errou!");
					System.out.println("numero pequeno!");
				}else if(chute > numRandom) {
					System.out.println("Vc errou!");
					System.out.println("numero grande");
				}else {
					acertou = true;
					System.out.println("éeeeeeeeeeeeeeeeeeee do brasil sil sil sil");
					System.out.println("Voce certou!!!!");

					break;
				}
				
			
		
		}

		
	}

}
