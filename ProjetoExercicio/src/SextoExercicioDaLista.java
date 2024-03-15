import java.util.Scanner;

public class SextoExercicioDaLista {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("valor um");
		int valor1 = teclado.nextInt();
		System.out.println("valor dois");
		int valor2 = teclado.nextInt();
		System.out.println("valor tres");
		int valor3 = teclado.nextInt();
		System.out.println("valor quatro");
		int valor4 = teclado.nextInt();

		int soma = valor1+valor2+valor3+valor4;
		
		System.out.println("Soma total: "+soma);
	}

}
