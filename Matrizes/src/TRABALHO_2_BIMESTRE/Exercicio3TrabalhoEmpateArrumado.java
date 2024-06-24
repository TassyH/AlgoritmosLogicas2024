package TRABALHO_2_BIMESTRE;

import java.util.Scanner;

public class Exercicio3TrabalhoEmpateArrumado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String[][] matriz = new String[3][3];
        String posicaoMarcadaX = "X";
        String posicaoMarcadaO = "O";
        String posicaoLivre = "*";
        boolean jogoOn = true;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = posicaoLivre;
            }
        }

        boolean jogadorX = true;
        boolean gameOver = false;
        int linha, coluna;

        while (jogoOn) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

          
            if (jogadorX) {
                System.out.println("Sr. X é a sua vez");
                System.out.println("informe a  posição LINHA e COLUNA:");
                linha = scan.nextInt();
                coluna = scan.nextInt();
            } else {
                System.out.println("Sr. O, é a sua vez");
                System.out.println("informe a  posição LINHA e COLUNA:");
                linha = scan.nextInt();
                coluna = scan.nextInt();
            }

           

            if (!matriz[linha][coluna].equals(posicaoLivre)) {
                System.out.println("posição já preenchida");
                continue;
            }

            if (jogadorX) {
                matriz[linha][coluna] = posicaoMarcadaX;
            } else {
                matriz[linha][coluna] = posicaoMarcadaO;
            }

            gameOver = (matriz[0][0].equals(matriz[0][1]) && matriz[0][1].equals(matriz[0][2]) && !matriz[0][0].equals(posicaoLivre)) || // linhas
                       (matriz[1][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[1][2]) && !matriz[1][0].equals(posicaoLivre)) || 
                       (matriz[2][0].equals(matriz[2][1]) && matriz[2][1].equals(matriz[2][2]) && !matriz[2][0].equals(posicaoLivre)) || 
                       (matriz[0][0].equals(matriz[1][0]) && matriz[1][0].equals(matriz[2][0]) && !matriz[0][0].equals(posicaoLivre)) || // colunas
                       (matriz[0][1].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][1]) && !matriz[0][1].equals(posicaoLivre)) || 
                       (matriz[0][2].equals(matriz[1][2]) && matriz[1][2].equals(matriz[2][2]) && !matriz[0][2].equals(posicaoLivre)) || 
                       (matriz[0][0].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][2]) && !matriz[0][0].equals(posicaoLivre)) || // diagonal 
                       (matriz[0][2].equals(matriz[1][1]) && matriz[1][1].equals(matriz[2][0]) && !matriz[0][2].equals(posicaoLivre));   // ddiagonal 

            if (gameOver) {
                if (jogadorX) {
                    System.out.println("JOGADOR X VENCEU");
                } else {
                    System.out.println("JOGADOR O VENCEU");
                }
                jogoOn = false;
            } else {
                boolean empate = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (matriz[i][j].equals(posicaoLivre)) {
                            empate = false;
                            break;
                        }
                    }
                }

                if (empate) { // quero só dizer que eu refiz essa merda 3 vezes por causa da desgraça desse empate e se isso cair na prova eu vou levar 32343 horas pra resolver
                    System.out.println("DEU VELHA");
                    jogoOn = false;
                } else {
                    jogadorX = !jogadorX; // muda jogador
                }
                
                
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

	}

}
