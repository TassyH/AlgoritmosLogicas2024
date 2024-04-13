import java.util.Scanner;

public class ExercicioLista15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com o ano 1, mes 2 e dia 2");
		int ano1 = teclado.nextInt();
		int mes1 = teclado.nextInt();
		int dia1 = teclado.nextInt();
		
		System.out.println("Entre com o ano 2, mes 2 e dia 2");
		int ano2 = teclado.nextInt();
		int mes2 = teclado.nextInt();
		int dia2 = teclado.nextInt();
		
		if(ano1 > ano2) {
			System.out.println("o ano 1 é maior");
		}else if(ano2>ano1) {
			System.out.println("o ano 2 é maior");
		}else {
			if(mes2 > mes2) {
				System.out.println("o ano 1 é maior");
			}else if(mes2>mes1) {
				System.out.println("o ano 2 é maior");
			}else {
				if(dia1>dia2) {
					System.out.println("o ano 1 é maior");
				}else if (dia2>dia1){
					System.out.println("o ano 2 é maior");
				}
			}
		}
	}

}
