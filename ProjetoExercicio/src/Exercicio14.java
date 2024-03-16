import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu salário-base");
		double salarioBase=teclado.nextDouble();
		
		double gratificacao = 0.05;
		double porcentagemImposto = 0.07;
		double calculoGratificacao = (salarioBase * gratificacao);
		double calculoSalario = calculoGratificacao+ salarioBase;
		double descontoImposto = calculoSalario*porcentagemImposto;
		double salarioTotal = calculoSalario - descontoImposto;
		
		System.out.println("Valor de gratificação = "+calculoGratificacao+" R$");
		System.out.println("Valor de imposto a pagar = "+descontoImposto+" R$");
		System.out.println("O valor final do seu salário é de "+salarioTotal+" R$");


	}

}
