import java.util.Scanner;

public class ExercicioLista6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("entre com um numero inteiro postivo de 1 a 5");
		int num = teclado.nextInt();
		
		if(num ==1) {
			System.out.println("Domingo");

		}else if(num ==2) {
			System.out.println("Segunda");

		}else if(num ==3) {
			System.out.println("Terça");

		}else if(num ==4) {
			System.out.println("Quarta");

		}else if(num ==5) {
			System.out.println("Quinta");

		}else if(num ==6) {
			System.out.println("Sexta");

		}else if(num ==7) {
			System.out.println("Sabado");

		}else {
			System.out.println("opção invalida :(");
		}
	}

}
