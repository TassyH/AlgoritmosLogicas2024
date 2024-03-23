import java.util.Scanner;

public class ExercicioLista12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade,bro");
		int idade = teclado.nextInt();
		
		if(idade >=5 && idade <=10) {
			System.out.println("categoria: gosta de Pepa Pig(INFANTIL)");
		}else if(idade >= 11 && idade <=15){
			System.out.println("categoria: Yo soy rebelde (JUVENIL)");
		}else if(idade >= 16 && idade <=20) {
			System.out.println("categoria: Manda bem (JUNIOR)");
		}else if(idade >=21 && idade <=33) {
			System.out.println("categoria: Profissa (PROFISSIONAL)");
		}else if(idade >=34 ) {
			System.out.println("Tu é o cara (THE BEST)");
		}
	}

}
