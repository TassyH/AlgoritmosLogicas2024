import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do salario");
		double salario = teclado.nextDouble();
		double aumento = 0.25;
		double calculoAcresciomo = (salario * aumento);
		double salarioTotal = salario+calculoAcresciomo;
		System.out.println("O seu novo salario é: "+salarioTotal);
	}

}
