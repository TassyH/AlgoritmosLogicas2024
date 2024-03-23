import java.util.Scanner;

public class ExercicioLista4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("entre com um numero");
		int numero = teclado.nextInt();
		
		if(numero%2==0) {
			System.out.println("é par");
		}else {
			System.out.println("é impar");
		}
		
	}

}
// pelo menos nao sou nota dó