import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe o primeiro valor");
		float valorUm = teclado.nextFloat();
		System.out.println("Informe o segundo valor");
		float valorDois = teclado.nextFloat();
		
		System.out.println("");
		double soma = valorUm+valorDois;
		double subtracao = valorUm-valorDois;
		double divisao = valorUm/valorDois;
		double multiplicacao = valorUm*valorDois;
		double resto = valorUm%valorDois;
		
		System.out.println("CALCULADORA DE 5 OPERAÇOES");
		System.out.println("SOMA = "+soma);
		System.out.println("SUBTRAÇÃO = "+subtracao);
		System.out.println("DIVISÃO = "+divisao);
		System.out.println("MULTIPLICAÇÃO = "+multiplicacao);
		System.out.println("RESTO = "+resto);




		
		
		
	}

}
