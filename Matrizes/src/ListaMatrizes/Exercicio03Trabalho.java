package ListaMatrizes;

import java.util.Scanner;

public class Exercicio03Trabalho {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[][] matriz = new String[3][3];
		String posicaoMarcadaX = "x";
		String posicaoMarcadaO = "o";
		String posicaoLivre = "*";
		boolean jogoOn = false;

		System.out.println("bem vindo ao Jogo da Velha das Galáxias!!!");
		int i, j = 0;
		boolean gameOver = false;
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = posicaoLivre;
				System.out.print(matriz[i][j] + " ");
				if (matriz[i][j] == posicaoLivre && gameOver == false) {
					jogoOn = true;
				}
			}
			System.out.println();

		}

		while (jogoOn) {
			int linha = 0;
			int coluna = 0;
			boolean jogadorX = true;
			boolean jogadorO = false;
			boolean jogadorXperdeu = false;
			boolean jogadorOPerdeu = false;

			// loop do jogador A
			while (jogadorX && gameOver == false) {
				
				for (i = 0; i < matriz.length; i++) {
					for (j = 0; j < matriz[i].length; j++) {
						if (!matriz[i][j].equals(posicaoLivre)) {
							System.out.println("EMPATE");
							jogadorXperdeu = true;
							gameOver = true;
							jogoOn = false;
						}
					}
				}
				
				System.out.println("PRIMEIRO JOGADOR (X)");
				System.out.println("Sr. X, marque sua primeira posição informado LINHA e COLUNA");
				linha = scan.nextInt();
				coluna = scan.nextInt();

				if (matriz[linha][coluna].equals(posicaoLivre)) {
					for (i = 0; i < matriz.length; i++) {
						for (j = 0; j < matriz[i].length; j++) {
							matriz[linha][coluna] = posicaoMarcadaX;
							System.out.print(matriz[i][j] + "  ");

						}

						System.out.println();
					}
					if ((matriz[0][0].equals(posicaoMarcadaX) && matriz[0][1].equals(posicaoMarcadaX)
							&& matriz[0][2].equals(posicaoMarcadaX))
							|| (matriz[1][0].equals(posicaoMarcadaX) && matriz[1][1].equals(posicaoMarcadaX)
									&& matriz[2][2].equals(posicaoMarcadaX))
							|| (matriz[2][0].equals(posicaoMarcadaX) && matriz[2][1].equals(posicaoMarcadaX)
									&& matriz[2][2].equals(posicaoMarcadaX))
							// diagonais
							|| (matriz[0][0].equals(posicaoMarcadaX) && matriz[1][1].equals(posicaoMarcadaX)
									&& matriz[2][2].equals(posicaoMarcadaX))
							|| (matriz[0][2].equals(posicaoMarcadaX) && matriz[1][1].equals(posicaoMarcadaX)
									&& matriz[2][0].equals(posicaoMarcadaX))
							// vestical
							|| (matriz[0][0].equals(posicaoMarcadaX) && matriz[1][0].equals(posicaoMarcadaX)
									&& matriz[2][0].equals(posicaoMarcadaX))
							|| (matriz[0][1].equals(posicaoMarcadaX) && matriz[1][1].equals(posicaoMarcadaX)
									&& matriz[2][1].equals(posicaoMarcadaX))
							|| (matriz[0][2].equals(posicaoMarcadaX) && matriz[1][2].equals(posicaoMarcadaX)
									&& matriz[2][2].equals(posicaoMarcadaX))) {
						System.out.println("O JOGADOR O VENCEUU");
						jogadorXperdeu = false;
						jogadorOPerdeu =  true;
						gameOver = true;
						jogoOn = false;
					}

					jogadorX = false;
					jogadorO = true;
				

				} else {
					for (i = 0; i < matriz.length; i++) {
						for (j = 0; j < matriz[i].length; j++) {
							if (!matriz[i][j].equals(posicaoLivre)) {
									System.out.println("Posiçao ja preenchida!!!!");
									System.out.println("marque sua primeira posição informado LINHA e COLUNA");
									System.out.println("-------------------------");
									continue;
								}
							}
						}
					}
					
				}
					

			// loop do jogador B
			while (jogadorO && gameOver == false) {
				
				
				System.out.println("PRIMEIRO JOGADOR (O)");
				System.out.println("Sr. O, marque sua primeira posição informado LINHA e COLUNA");
				linha = scan.nextInt();
				coluna = scan.nextInt();

				if (matriz[linha][coluna].equals(posicaoLivre)) {
					for (i = 0; i < matriz.length; i++) {
						for (j = 0; j < matriz[i].length; j++) {
							matriz[linha][coluna] = posicaoMarcadaO;

							System.out.print(matriz[i][j] + "  ");

						}
						System.out.println();
					}

					if ((matriz[0][0].equals(posicaoMarcadaO) && matriz[0][1].equals(posicaoMarcadaO)
							&& matriz[0][2].equals(posicaoMarcadaO))
							|| (matriz[1][0].equals(posicaoMarcadaO) && matriz[1][1].equals(posicaoMarcadaO)
									&& matriz[2][2].equals(posicaoMarcadaO))
							|| (matriz[2][0].equals(posicaoMarcadaO) && matriz[2][1].equals(posicaoMarcadaO)
									&& matriz[2][2].equals(posicaoMarcadaO))
							// diagonais
							|| (matriz[0][0].equals(posicaoMarcadaO) && matriz[1][1].equals(posicaoMarcadaO)
									&& matriz[2][2].equals(posicaoMarcadaO))
							|| (matriz[0][2].equals(posicaoMarcadaO) && matriz[1][1].equals(posicaoMarcadaO)
									&& matriz[2][0].equals(posicaoMarcadaO))
							// vestical
							|| (matriz[0][0].equals(posicaoMarcadaO) && matriz[1][0].equals(posicaoMarcadaO)
									&& matriz[2][0].equals(posicaoMarcadaO))
							|| (matriz[0][1].equals(posicaoMarcadaO) && matriz[1][1].equals(posicaoMarcadaO)
									&& matriz[2][1].equals(posicaoMarcadaO))
							|| (matriz[0][2].equals(posicaoMarcadaO) && matriz[1][2].equals(posicaoMarcadaO)
									&& matriz[2][2].equals(posicaoMarcadaO))) {
						System.out.println("O JOGADOR O VENCEUU");
						jogadorXperdeu = true;
						jogadorOPerdeu = false;
						gameOver = true;
						jogoOn = false;
					}

					jogadorX = true;
					jogadorO = false;
				} else {
					for (i = 0; i < matriz.length; i++) {
						for (j = 0; j < matriz[i].length; j++) {
							if (!matriz[i][j].equals(posicaoLivre)) {
									System.out.println("Posiçao ja preenchida!!!!");
									System.out.println("marque sua primeira posição informado LINHA e COLUNA");
									System.out.println("-------------------------");
									continue;
								}
							}
						}
					
				}
			}
			
			if(jogadorXperdeu) {
				System.out.println("vencedor O leva tudoooo");
			}else if(jogadorOPerdeu) {
				System.out.println("vencedor X leva tudoooo");

			}else {
				System.out.println("deu véia familia");

			}

		}

	}

}
