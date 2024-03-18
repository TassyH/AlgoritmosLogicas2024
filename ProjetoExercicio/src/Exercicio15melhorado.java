import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio15melhorado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
	    double juros = 0.0056;
        double saldo= 0;
        double valorDeposito;
        double valorSaque;
        double operacaoSaque;
        double rendimentoMensal = 0;

        int contador = 1;

	        
        
        
    while (contador != 0) {

        System.out.println("Escolha uma operacaçao");
        System.out.println("1 - saque");
        System.out.println("2 - deposito");
        System.out.println("3 - consulta");
        System.out.println("4 - ver rendimento mensal do seu dinheiro depositado");
        int operacao = teclado.nextInt();
        
        switch (operacao) {
            case 1:
                System.out.println("Entre com o valor que deseja sacar");
                valorSaque = teclado.nextDouble();
                if (valorSaque > saldo) {
                    System.out.println("Saque NEGADO! Valor de saque maior que o valor de saldo");
                }else{
                    saldo = saldo- valorSaque;
                    System.out.println("O saldo da sua conta atual é de R$ "+saldo+" reais");

                }
    continue;
            case 2:
                System.out.println("Entre com o valor que deseja DEPOSITAR");
                valorDeposito = teclado.nextDouble();
                saldo = saldo+valorDeposito;
    continue;
            case 3:
                System.out.println("O saldo da sua conta atual é de R$ "+saldo+" reais");
    continue;
            case 4:
                System.out.println("Sua conta tem um rendimento mensal de 0,56%");
                for (int i = 1; i<=5; i++){
                    double rendimennto;
                    rendimentoMensal = saldo*juros;
                    rendimennto = rendimentoMensal +i;
                    System.out.println(rendimennto);
    
                }
                

    continue;
            case 0:
            System.out.println("VOCE SAIU DA OPERACAO");
            contador = 0;
                break;
            }
       }
    }
}
