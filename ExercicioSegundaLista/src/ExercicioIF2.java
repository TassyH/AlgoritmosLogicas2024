import java.util.Scanner;

public class ExercicioIF2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("DIGITE ALGUM NUMERO DE 1 A 5 NO NOSSO SORTEI DE FRUTINNNHAS");
		int fruta = teclado.nextInt();
		if(fruta==1) {
			System.out.println("Mamao");
		}else if(fruta == 2) {
			System.out.println("Goiaba");
		}else if(fruta==3) {
			System.out.println("Limao");
		}else if(fruta == 4) {
			System.out.println("Kiwi");
		}else if(fruta ==5) {
			System.out.println("Banana");
		}
	}

}
