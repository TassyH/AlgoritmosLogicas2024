import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a sua IDADE");
		int idade = teclado.nextInt();
		System.out.println("Entre com o seu PESO");
		double peso = teclado.nextDouble();
		
		if(idade < 25 && peso <= 65) {
			System.out.println("Grupo 1");
		}else if(idade < 25 && peso >= 65 && peso <=100) {
			System.out.println("Grupo 2");
		}else if(idade < 25 && peso > 100) {
			System.out.println("Grupo 3");
			//idade >= 25 e <=60
		}else if(idade >= 25 && idade <=60 && peso <= 65 ) {
			System.out.println("Grupo 4");
		}else if(idade >= 25 && idade <=60 && peso >= 65 && peso <=100) {
			System.out.println("Grupo 5");
		}else if(idade >= 25 && idade <=60 && peso > 100) {
			System.out.println("Grupo 6");
			//idade >60
		}else if(idade > 60 && peso <= 65) {
			System.out.println("Grupo 7");
		}else if(idade > 60 && peso >= 65 && peso <=100) {
			System.out.println("Grupo 8");
		}else if(idade > 60 && peso > 100) {
			System.out.println("Grupo 9");
		}

	}

}
