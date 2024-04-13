import java.util.Scanner;

public class ExercicioLista13 {

	public static void main(String[] args) {

	/*
	 * 13. Criar um programa que irá ler o salário de um trabalhador
	 *  e o valor da prestação de um empréstimo, se   a   prestação   for
	 *  maior   que   20%   do   salário   imprima:   Empréstimo não concedido!  
	 *  caso contrário imprima: Empréstimo concedido!.
	 *  */
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Entre com o salário: ");
		double salario = teclado.nextDouble();
		System.out.println("Entre com o valor da prestação do empréstimo: ");
		double prestacao = teclado.nextDouble();
		
		double calcPorcetagem = salario*0.2;
		
		if( prestacao > calcPorcetagem) {
			System.out.println("Emprestimo não concedido!");
			System.out.println("A parcela do seu empréstimo é menor que 20% do seu salário mensal, que é R$ "+calcPorcetagem+" (20%)");
		}else {
			System.out.println("Emprestimo concebido");
		}
		
		
		
		
	}

}
