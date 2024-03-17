import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    double juros = 0.0056;
	        
		System.out.println("Entre com valor de depósito: ");
	    double deposito = teclado.nextDouble();
		double juros_mes_um = deposito * juros;
		double saldo_mes_um = deposito+juros_mes_um;

	    double novoDeposito = 303.20;
		double soma_saldos = saldo_mes_um+novoDeposito;
		double juros_mes_dois = (soma_saldos)*juros;
		double saldo_mes_dois = juros_mes_dois + soma_saldos;

		
	    double sacaValor = 58.25;
		double novo_valor_mes_tres = saldo_mes_dois - sacaValor;
		double juros_mes_tres = novo_valor_mes_tres *juros;
		double saldo_mes_tres = juros_mes_tres + novo_valor_mes_tres;

		double juros_mes_quatro = saldo_mes_tres * juros;
		double saldo_mes_quatro = juros_mes_quatro+saldo_mes_tres;

		System.out.printf("Saldo do primeiro mes = %.2f \n",saldo_mes_um);
		System.out.printf("Saldo do segundo mes com o deposito de "+novoDeposito+" reais é =  %.2f \n",saldo_mes_dois);
		System.out.printf("Saldo do terceiro mes com o saque de  "+sacaValor+" reais é = %.2f \n",saldo_mes_tres);
		System.out.printf("Saldo do mes quatro = %.2f ",saldo_mes_quatro);


	
	    
	    //for(int i = 1; i<mes.size(); i++) {
	    //	rendimentoMensal = (i*rendimento)+deposito;
		//	System.out.println(rendimentoMensal);
		

	  //  }
	//	System.out.println(mesLista[2]);
	//	System.out.println(mesLista[3]);
	//	System.out.println(mesLista[4]);




	    

	}

}
