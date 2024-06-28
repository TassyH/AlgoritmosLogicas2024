import java.util.Random;

public class BuscaMatriz {

	public static void main(String[] args) {

		// popular uma matriz com numeroa aleatórios e quando for < 5 substituir por 0
		int matriz [][] = new int [3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			//
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = new Random().nextInt(10);
				System.out.print(matriz[i][j]+" ");
				
				if(matriz[i][j] < 5) {
					matriz[i][j] = 0;
				}
				
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();

		}
	}

}
