package QuartaListaExercicios;

import java.util.Scanner;

public class Exercicio2 {
	
   public static void main(String[] args) {
	
	   //2.	Criar um programa que irá ler N (>=1) números do teclado e informar a produto destes números.
	   
	    int produto = 1;
		Scanner leitor = new Scanner(System.in);
		System.out.println("entre com um numero");
		int num  = leitor.nextInt();
		
		for(int i = 1; i<=num;i++) {
			produto = produto*i;
			System.out.println(i);
		}
		System.out.println(produto);
  }
}
