import java.util.Scanner;

public class ExercicioLista7 {

	public static void main(String[] args) {
		//Crie um programa para ler o tipo do investimento e o valor investido, em seguida, o programa deverá calcular e escrever o valor reajustado pelo rendimento
		Scanner teclado = new Scanner(System.in);
		
		double calculoRendimento;
		double valorTotal;
		System.out.println("informe o tipo de investimento que deseja fazer:");
		System.out.println(" TIPO |  DESCRIÇÃO  | RENDIMENTO ");
		System.out.println("  1   |   Poupança  |   1,85%  ");
		System.out.println("  2   | Fundos XPTO |   2,50%  ");
		
		System.out.println("Entre com o tipo de investimento");
		double tipoInvest = teclado.nextDouble();
		System.out.println("Entre com o valor que deseja depositar");
		double valorInvest = teclado.nextDouble();
		
		if(tipoInvest == 1) {
			calculoRendimento = valorInvest * 0.0185;
			valorTotal = valorInvest + calculoRendimento;
			System.out.println("Seu redimento é de = "+calculoRendimento);
			System.out.println("Seu salto total é de = "+valorTotal);
			
		}else if(tipoInvest == 2) {
			calculoRendimento = valorInvest * 0.0250;
			valorTotal = valorInvest + calculoRendimento;
			System.out.println("Seu redimento é de = "+calculoRendimento);
			System.out.println("Seu salto total é de = "+valorTotal);
		}
		
		
		
	}

}
