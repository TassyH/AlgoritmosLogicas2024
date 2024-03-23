import java.util.Scanner;

public class ExercicioLista1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre primeiro número");
		int numeroUm = teclado.nextInt();
		System.out.println("Entre segundo número");
		int numeroDois = teclado.nextInt();
		if(numeroUm >numeroDois){
			System.out.println("o primeiro numero é o maior");
		}else if (numeroUm < numeroDois){
			System.out.println("o segundo numero é o maior");
		}else{
			System.out.println("o primeiro e o segundo sao iguais");
		}
		{
			
		}
	}

}
