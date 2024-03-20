import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/* 1 - [0,5] Criar um programa que irá ler os 3 lados de um triângulo e na sequência deverá
		informar se o triângulo é equilátero, isósceles ou escaleno.*/
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("------> BEM-VINDO AO ORACULO DA GEOMETRIA <--------");
		System.out.println("Entre com o primeiro lado do triangulo");
		double ladoUm = teclado.nextDouble();
		System.out.println("Entre com o segundo lado do triangulo");
		double ladoDois = teclado.nextDouble();
		System.out.println("Entre com o terceiro lado do triangulo");
		double ladoTres = teclado.nextDouble();
				
		if(ladoUm == ladoDois && ladoTres == ladoDois) {
			System.out.println("Eu prevejo que seu triangulo é EQUILÁTERO");
		}else if (ladoUm == ladoDois || ladoDois == ladoTres || ladoTres==ladoUm) {
			System.out.println("Eu prevejo que seu traingulo é ISÓSCELES");
		}else {
			System.out.println("Eu prevejo que seu triangulo é ESCALENO");
		}
	

		


	}

}
