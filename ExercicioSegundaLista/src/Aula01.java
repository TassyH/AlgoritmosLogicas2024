import java.util.Scanner;

public class Aula01 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe a sua idade");
		int idade = teclado.nextInt();
		
		if(idade >=18) {
			System.out.println("pode entrar na baladinha");
		}else {
			System.out.println("volta pro berço baby");
		}
		

	}

}
