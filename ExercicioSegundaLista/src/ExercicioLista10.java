import java.util.Scanner;

public class ExercicioLista10 {

	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double conta = 0;
    
		System.out.println("Entre com o operador");
		String operacao = teclado.next();
		System.out.println("Entre com o valor 1");
		double valor1 = teclado.nextInt();
		System.out.println("Entre com o valor 2");
		double valor2 = teclado.nextInt();
		
		if(operacao.equals("/")) {
			conta = valor1 / valor2;
			System.out.println("O resultado da divisao é = "+conta);

		}else if(operacao.equals("*")) {
			conta = valor1 * valor2;
			System.out.println("O resultado da multiplicaçao é = "+conta);

		}else if(operacao.equals("+")) {
			conta = valor1 + valor2;
			System.out.println("O resultado da soma é = "+conta);

		}else if(operacao.equals("-")) {
			conta = valor1 - valor2;
			System.out.println("O resultado da subtração é = "+conta);
		
	}
	}
}
