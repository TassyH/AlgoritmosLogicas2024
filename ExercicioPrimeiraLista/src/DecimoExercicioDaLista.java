import java.util.Scanner;

public class DecimoExercicioDaLista {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Entre com o valor em celsius");
		double celsius = teclado.nextDouble();
		
		double fahrenheit = (celsius*1.8)+32;
		System.out.println("A temperatura de "+celsius+"ºC em Fahrenheint é "+fahrenheit+"ºF");
	}

}
