import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entre com a quantidade de pães que voce vendeu");
		int qtdPao = teclado.nextInt();
		System.out.println("Entre com a quantidade de broas que voce vendeu");
		int qtdBroa = teclado.nextInt();
		
		double valorPao = 0.17;
		double valorBroa = 3.50;
		
		double calcVendaPao = qtdPao*valorPao;
		double calcVendaBroa = qtdBroa*valorBroa;
		double somaVendas = calcVendaBroa+calcVendaPao;
		double calcValorGuardado = (somaVendas *0.08);
		
		System.out.println("Valor total de Paes vendidos = "+calcVendaPao);
		System.out.println("Valor total de Broas vendidos = "+calcVendaBroa);
		System.out.println("O valor total das suas vendas foi de R$ "+somaVendas);
		System.out.println("Valor a ser guardado (8%) = "+calcValorGuardado);
	}

}
