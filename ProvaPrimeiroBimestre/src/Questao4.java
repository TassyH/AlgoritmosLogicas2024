import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o valor da nota 1");
		double nota1 = teclado.nextDouble();
		System.out.println("Entre com o valor da nota 2");
		double nota2 = teclado.nextDouble();
		System.out.println("Entre com o valor da nota 3");
		double nota3 = teclado.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		System.out.println("Média = "+media);
		
		if(media < 4) {
			System.out.println("conceito E");
			System.out.println("REPROVADO");
		}else if(media >= 4 && media <6) {
			System.out.println("conceito D");
			System.out.println("REPROVADO");
		}else if(media >=6 && media < 7.5) {
			System.out.println("conceito C");
			System.out.println("APROVADO");
		}else if(media >=7.5 && media <9) {
			System.out.println("conteito B");
			System.out.println("APROVADO");
		}else if(media >= 9) {
			System.out.println("conteito A");
			System.out.println("APROVADO");
		}


	}

}
