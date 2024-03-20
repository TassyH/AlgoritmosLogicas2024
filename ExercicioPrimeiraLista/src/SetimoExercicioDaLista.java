import java.util.Scanner;

public class SetimoExercicioDaLista {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Entre com o seu ano atual");
		int anoAtual = teclado.nextInt();
		System.out.println("Entre com o seu ano de nascimento");
		int anoNascimento = teclado.nextInt();
		int idadeAtual = anoAtual - anoNascimento; 
		System.out.println("Sua idade atual: "+idadeAtual+" anos");
		int anoFuturo = 2045 - anoAtual;
		int idadeFutura = idadeAtual + anoFuturo;
		System.out.println("E em 2024 voce terá: "+idadeFutura+" anos");
		
	}

}
