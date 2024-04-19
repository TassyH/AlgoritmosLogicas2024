import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*[1,0] O salário líquido de um funcionário é composto pelo salário base acrescido de uma
		gratificação (segundo a tabela abaixo). Entretanto, um desconto é realizado no salário
		base de 6,5% antes de acrescentar a gratificação. Crie um programa para ler o salário
		base, calcular e escrever o salário líquido. O programa deve ler também o nome do
		funcionário.*/
		double salarioDescontado;
		double salarioLiquido = 0;
		double desconto = 0.065;
		Scanner teclado = new Scanner(System.in);
		System.out.println("ENTRE COM O NOME DO FUNCIONÁRIO:");
		String nomeFuncio = teclado.nextLine();
		
		System.out.println(" ---------------------------------------------");
		System.out.println("Entre com o salário BASE do funcionário");
		double salarioBase = teclado.nextDouble();
		
		if(salarioBase <= 350.00) {
			salarioDescontado  = salarioBase - (desconto*salarioBase);
			salarioLiquido = salarioDescontado+100;
			System.out.println("Seu salário base com o desconto de 6,5% é de R$ "+salarioDescontado +" reais");
			System.out.println("O(a) funcionário(a) "+nomeFuncio+" recebeu uma gratificação de R$ 100,00");
			System.out.println("O salário líquido do(a) funcionário(a) "+nomeFuncio+" é R$ "+salarioLiquido);
			
		}else if(salarioBase > 350.00 && salarioBase <= 600.00) {
			salarioDescontado  = salarioBase - (desconto*salarioBase);
			salarioLiquido = salarioDescontado + 75;
			System.out.println("Seu salário base com o desconto de 6,5% é de R$ "+salarioDescontado +" reais");
			System.out.println("O(a) funcionário(a) "+nomeFuncio+" recebeu uma gratificação de R$ 75,00");
			System.out.println("O salário líquido do(a) funcionário(a) "+nomeFuncio+" é R$ "+salarioLiquido);
			
		}else if(salarioBase > 600.00 && salarioBase <= 900.00) {
			salarioDescontado  = salarioBase - (desconto*salarioBase);
			salarioLiquido = salarioDescontado+50;
			System.out.println("Seu salário base com o desconto de 6,5% é de R$ "+salarioDescontado +" reais");
			System.out.println("O(a) funcionário(a) "+nomeFuncio+" recebeu uma gratificação de R$ 50,00");
			System.out.println("O salário líquido do(a) funcionário(a) "+nomeFuncio+" é R$ "+salarioLiquido);
			
		}else if(salarioBase > 900.00) {
			salarioDescontado  = salarioBase - (desconto*salarioBase);
			salarioLiquido = salarioDescontado+35;
			System.out.println("Seu salário base com o desconto de 6,5% é de R$ "+salarioDescontado +" reais");
			System.out.println("O(a) funcionário(a) "+nomeFuncio+" recebeu uma gratificação de R$ 35,00");
			System.out.println("O salário líquido do(a) funcionário(a) "+nomeFuncio+" é R$ "+salarioLiquido);
		}


	}

}
