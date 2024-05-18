import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com a BASE do triangulo");
		double base = teclado.nextDouble();
		System.out.println("Entre com a ALTURA do trinagulo");
		double altura = teclado.nextDouble();
		
		double area = (base*altura)/2;
		System.out.println("A área do triangulo é "+area);
		if(area>=300) {
			System.out.println("Area grande");
		}else if(area < 300) {
			System.out.println("Area pequena");
		}

	}

}
