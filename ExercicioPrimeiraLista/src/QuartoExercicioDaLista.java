import java.util.Scanner;

public class QuartoExercicioDaLista {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor");
		int valorUm = teclado.nextInt();
		System.out.println("Entre com o segundo valor");
		int valorDois = teclado.nextInt();
		
		valorUm = valorDois;
		valorDois = valorUm;
		//int inverte = valorDois;
		//inverte = valorUm;
		System.out.println("novo valor do ValorUm: "+valorUm);
		System.out.println("novo valor do ValorDois: "+valorDois);


		
	}

}
