import java.util.Scanner;

public class ExercicioIF {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite a sua nota");
		float nota = teclado.nextFloat();
		System.out.println("informe a sua frequencia");
		int frequencia = teclado.nextInt();
		
		if(nota >=7 && frequencia >=75) {
			System.out.println("aluno aprovado");
		}else {
			System.out.println("deu ruim");
		}
		
	
	
	}

}
