import java.util.Scanner;

public class ExercicioLista3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double potencia = 0;
		double raiz = 0;
		System.out.println("Entre com o número");
		double numero = teclado.nextDouble();
		
		if(numero>0) {
			raiz = Math.sqrt(numero);
			System.out.println("a raiz quadrada desse numero é: "+raiz);
		}else {
			potencia = Math.pow(numero, 2);
			System.out.println("o numero inserido elevado ao quadrado é: "+potencia);
		}
		
	}

}
