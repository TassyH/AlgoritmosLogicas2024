import java.util.Scanner;

public class ExercicioLista5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("entre com a sua nota");
		int nota1 = teclado.nextInt();
		System.out.println("entre com a segunda nota");
		int nota2 = teclado.nextInt();		
		
		double media = (nota1+nota2)/2;
		
		if(media >=7) {
			System.out.println("aprovado");
		}else if (media<7) {
			System.out.println("nota dó pra vc");
		}
	}

}
