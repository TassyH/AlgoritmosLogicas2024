import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o numero da largura");
		double largura = teclado.nextDouble();
		System.out.println("Entre com o numero do comprimento");
		double comprimento = teclado.nextDouble();
		System.out.println("Entre com o valor do metro do terreno");
		double metro = teclado.nextDouble();
		
		double calcArea, calcValorPg;
		
		calcArea = largura*comprimento;
		calcValorPg = calcArea*metro;
		
		System.out.println("A área do terreno é "+calcArea+" m2");
		System.out.println("O valor o terreno é de R$ "+calcValorPg+" reais");


	}

}
