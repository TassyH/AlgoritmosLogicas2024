package ListaBlack;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//4.	Criar um programa que irá ler um número inteiro (N>=1) e imprimir 
	   //se ele é primo ou não. Um número é primo quando o mesmo é divisível apenas por 1 e por ele mesmo
		
		Scanner teclado = new Scanner(System.in);
		int a = 0;
		int num =0;
	    int maior = 0;
	    int menor = 0;
		System.out.println("Entre com um numero");
		int loopNum = teclado.nextInt(); 
		System.out.println("-------------------------------");

		while(a< loopNum) {
			num  = teclado.nextInt();
			a++;
			if(num/num==1 && num/1==num && num%2!=0 && num>1) {
				System.out.println(num+" é primo");
			}else {
				System.out.println("Não é primo");
			}
			
			
			
		}

		
	}

}
