import java.util.Random;
import java.util.Scanner;

public class ExercicioMediaArray {

	public static void main(String[] args) {
		//Random ramdom = new Random();
		Scanner scan = new Scanner(System.in);
		double media = 0;
		double soma = 0;
		int conta = 0;
		System.out.println("informe o tamanho do array");
		int tamanho = scan.nextInt();
		int [] vetor = new int [tamanho];

		for (int i = 0; i<=vetor.length - 1; i++) {
			vetor[i] = new Random().nextInt(20);
			soma = vetor[i]+soma;
			conta = i+1;
			System.out.println(vetor[i]);


		}
		media = soma/conta;
		System.out.println("soma do contador = "+conta);

		System.out.println("soma das médias = "+soma);
		System.out.println("media = "+media);

		
	}

}
