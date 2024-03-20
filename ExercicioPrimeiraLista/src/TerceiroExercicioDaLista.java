import java.util.Scanner;

public class TerceiroExercicioDaLista {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		double nota = teclado.nextDouble();
		System.out.println("Eentre com a segunda nota: ");
		double nota2 = teclado.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		double nota3 = teclado.nextDouble();
		
		double calculoNota = (nota+nota2+nota3)/3;
		System.out.println("A sua média é: "+ calculoNota);
	}

}
