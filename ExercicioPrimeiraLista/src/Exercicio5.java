import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("CALCULADORA DE IMC");
		System.out.println("Entre com o valor de peso");
		double peso = teclado.nextDouble();
		System.out.println("Entre com a altura");
		double altura = teclado.nextDouble();
		double imc = peso/(altura*altura);
		System.out.println("Seu imc é: "+imc);
	}

}
