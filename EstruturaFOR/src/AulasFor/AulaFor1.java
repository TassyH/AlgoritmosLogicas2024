package AulasFor;

import java.util.Scanner;

public class AulaFor1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero");
		int n = leitor.nextInt();
		
		for(int i = 1; i <=10; i=i+1) {
			int m = n*i;
			System.out.println(n+" x "+i+" = "+m);
		}

	}

}
