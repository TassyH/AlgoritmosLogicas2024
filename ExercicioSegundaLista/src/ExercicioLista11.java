import java.util.Scanner;

public class ExercicioLista11 {

	public static void main(String[] args) {
		// 11.	Criar um programa que irá ler um número (ponto flutuante) e na sequência deverá imprimir o valor absoluto do número lido.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com com um número");
		int numero = teclado.nextInt();
		
		//int vetor [] = new int [numero];
		
		//for(int i = 1; i <numero; i++) {
		//	vetor[numero] = i;
		//	System.out.println(vetor);
		//}
		
		int absoluto = Math.abs(numero);
		System.out.println("O número absoluto de "+numero+" é "+absoluto);
		

	}

}
