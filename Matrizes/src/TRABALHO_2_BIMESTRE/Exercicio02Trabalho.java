package TRABALHO_2_BIMESTRE;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02Trabalho {

	public static void main(String[] args) {

		/*
		 * Criar um programa para manipular arrays (considerar 10 posições). Deverá ser
		 * exibido o seguinte menu para o usuário: 1 – Inserir Usuário deve digitar um
		 * numero e uma posição. Este número deverá ser inserido na posição. 2 –
		 * Imprimir arrays Imprime todos os valores do array. 3 – Verificar se o número
		 * existe Usuário deve digitar um número e o programa retorna se o número existe
		 * ou não. 4 – Buscar por posição Usuário deve digitar uma posição e o programa
		 * retorna o valor daquela posição. 5 – Verificar anterior Usuário informa uma
		 * posição e o programa retorna o valor da posição anterior. 6 – Verificar
		 * posterior Usuário informa uma posição e o programa retorna o valor da posição
		 * posterior. 7 – Somar array Retorna a soma de todos os valores do array. 8 –
		 * Eliminar os ímpares Programa deve buscar todos os números ímpares do array e
		 * substituir pelo próximo par
		 */
		Scanner leitor = new Scanner(System.in);
		int num = 0;
		int posicao = 0;

		int[] arrayMontado = new int[10];

		boolean laco = true;

		while (laco == true) {
			System.out.println("opcao 1 - inserir posicao/valor no array");
			System.out.println("opcao 2 - imprimir todos os arrays");
			System.out.println("opçao 3 - verificar se o numero existe");
			System.out.println("opcao 4 - buscar por posição");
			System.out.println("opcao 5 - verificar o anterior");
			System.out.println("opcao 6 - verificar o posterior");
			System.out.println("opçao 7 – Retorna a soma de todos os valores do array.");
			System.out.println("opcao 8 - Programa deve buscar todos os números ímpares do array e substituir pelo próximo par");

			System.out.println("***********************************");

			int opcao = leitor.nextInt();

			if (opcao == 1) {
				System.out.println("Entre com a posição");
				posicao = leitor.nextInt();
				System.out.println("Entre com um numero");
				num = leitor.nextInt();
				arrayMontado[posicao] = num;

			} else if (opcao == 2) {
				for (int i = 0; i < arrayMontado.length; i++) {
					System.out.print(arrayMontado[i] + " ");
				}
				System.out.println("");
			} else if (opcao == 3) {
				System.out.println("Entre com o numero que deseja verificar se existe");
				int existeNum = leitor.nextInt();

				boolean existe = false;
				for (int i = 0; i < arrayMontado.length; i++) {
					if (arrayMontado[i] == existeNum) {
						existe = true;
						break;
					}
				}
				if (existe) {
					System.out.println("existe");
				} else {
					System.out.println("nom existe");
				}

				System.out.println("");

			} else if (opcao == 4) {
				System.out.println("Entre com a posiçao do numero que deseja procurar");
				int buscaNum = leitor.nextInt();

				System.out.println("A posição que vc digitou tem esse numero: " + arrayMontado[buscaNum]);
				System.out.println("");

			} else if (opcao == 5) {
				System.out.println("Entre com a posiçao do numero que deseja descobrir o antecessor");
				int buscaNumAnterior = leitor.nextInt();
				int posicaoMenor = 0;
				for (int i = 0; i < arrayMontado.length; i++) {
					posicaoMenor = arrayMontado[buscaNumAnterior - 1];
				}
				System.out.print(posicaoMenor+" ");

				System.out.println("");

			} else if (opcao == 6) {
				System.out.println("Entre com a posiçao do numero que deseja descobrir o antecessor");
				int buscaNumPosterior = leitor.nextInt();
				int posicaoMaior = 0;
				for (int i = 0; i < arrayMontado.length; i++) {
					posicaoMaior = arrayMontado[buscaNumPosterior + 1];
				}
				System.out.print(posicaoMaior+" ");

				System.out.println("");

			} else if (opcao == 7) {
				int soma = 0;

				System.out.println("Será feita a soma de todos os valores...");
				for (int i = 0; i < arrayMontado.length; i++) {
					soma = arrayMontado[i] + soma;
				}
				System.out.print(" " + soma);
				System.out.println("");

			} else if (opcao == 8) {
				int substitui = 0;

				System.out.println("Será feita a substituição de todos os valores impares do array");
				for (int i = 0; i < arrayMontado.length; i++) {
					if (arrayMontado[i] % 2 != 0 && arrayMontado[i] > 0) {
						substitui = arrayMontado[i] + 1;
						System.out.print(substitui + " ");

					}

				}
				System.out.println("");

			}

		}
	}
}
