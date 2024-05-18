package AulasFor;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("entre com um numero");
		int num  = leitor.nextInt();
		
		for(int i = 1; i<num; i++) {
			
			if(i%2==0) {
				int potencia = i*i;
				System.out.println(i+" par "+potencia);
			}else {
				int negativo = 0-i;
				System.out.println(i+" impar "+negativo);
			}
		}

	}

}
