package ListaBlack;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int a = 0;
		int num =0;
	    int alto = 0;
	    int baixo = 0;
		System.out.println("Entre com um numero");
		int loopNum = teclado.nextInt(); 
		System.out.println("-------------------------------");

		while(a< loopNum) {
			num  = teclado.nextInt();
			if(num>=5) {
				alto++;
			}else {
				baixo++;
			}
			}
		
	}

}
