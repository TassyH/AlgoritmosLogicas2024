import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * [1,0] Criar um programa para uma lanchonete Chinesa para calcular os itens
		 * consumidos. A referida lanchonete acabou de chegar ao Brasil e situa-se no
		 * interior de MG. Lembre-se que MG é diferente de MT
		 */

		 double calcPedido = 0;
		 int qtdPedido;
		 double desconto = 0;
		 double valorComDesconto = 0;
		 double valorParcelado = 0;
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("  CÓDIGO  |    DESCRIÇÃO                          | VALOR  ");
		 System.out.println(" -----------------------------------------------------------");
		 System.out.println("    14    | Morcego frito                         | R$ 15,50 ");
		 System.out.println("    26    | Ensopado de grilo                     | R$ 25,00");
		 System.out.println("    38    | Barata a dorê                         | R$ 12,00");
		 System.out.println("    46    | Cérebro de macaco com páprica defumada| R$ 67,00");
		 System.out.println(" -----------------------------------------------------------");
		 /*
		  * Em seguida, o programa (baseado na tabela anterior) deverá informar a
		  * descrição do produto, o valor total, o valor à vista com desconto de 5% e o
		  * valor parcelado em 3X no cartão sem juros.
		  */
 
		 System.out.println("Entre com o código do seu pedido :)");
		 int codPedido = teclado.nextInt();
		 
 
		 if (codPedido == 14) {
			 
			 System.out.println("Entre com a quantidade que deseja :)");
			 qtdPedido = teclado.nextInt();
			 
			 calcPedido = qtdPedido * 15.50;
			 desconto = calcPedido * 0.05;
			 valorParcelado = calcPedido / 3;
			 valorComDesconto = (calcPedido - desconto);
			 
			 System.out.println("--------------RESUMO TOTAL DO PEDIDO-------------");
			 System.out.println("DESCRIÇÃO: Morcego frito");
			 System.out.println("VALOR TOTAL: " + calcPedido);
			 System.out.println("VALOR C/ PAGAMENTO A VISTA (com desconto de 5% =  " + valorComDesconto);
			 System.out.println("VALOR C/ PARCELAMENTO (em 3x) = " + valorParcelado);
 
		 } else if (codPedido == 26) {
			 
			 System.out.println("Entre com a quantidade que deseja :)");
			 qtdPedido = teclado.nextInt();
			 
			 calcPedido = qtdPedido * 25.00;
			 desconto = calcPedido * 0.05;
			 valorComDesconto = (calcPedido - desconto);
			 valorParcelado = calcPedido / 3;
			 
			 System.out.println("--------------RESUMO TOTAL DO PEDIDO-------------");
			 System.out.println("DESCRIÇÃO: Ensopado de grilo");
			 System.out.println("VALOR TOTAL: " + calcPedido);
			 System.out.println("VALOR C/ PAGAMENTO A VISTA (com desconto de 5% =  " + valorComDesconto);
			 System.out.println("VALOR C/ PARCELAMENTO (em 3x) = " + valorParcelado);
 
		 } else if (codPedido == 38) {
			 
			 System.out.println("Entre com a quantidade que deseja :)");
			 qtdPedido = teclado.nextInt();
			 calcPedido = qtdPedido * 12.00;
			 desconto = calcPedido * 0.05;
			 valorComDesconto = (calcPedido - desconto);
			 valorParcelado = calcPedido / 3;
			 
			 System.out.println("--------------RESUMO TOTAL DO PEDIDO-------------");
			 System.out.println("DESCRIÇÃO: Barata a dorê");
			 System.out.println("VALOR TOTAL: " + calcPedido);
			 System.out.println("VALOR C/ PAGAMENTO A VISTA (com desconto de 5% =  " + valorComDesconto);
			 System.out.println("VALOR C/ PARCELAMENTO (em 3x) = " + valorParcelado);
			 
		 } else if (codPedido == 46) {
			 
			 System.out.println("Entre com a quantidade que deseja :)");
			 qtdPedido = teclado.nextInt();
			 calcPedido = qtdPedido * 67.00;
			 desconto = calcPedido * 0.05;
			 valorComDesconto = (calcPedido - desconto);
			 valorParcelado = calcPedido / 3;
			 
			 System.out.println("--------------RESUMO TOTAL DO PEDIDO-------------");
			 System.out.println("DESCRIÇÃO: Cérebro de macaco com páprica defumada");
			 System.out.println("VALOR TOTAL = " + calcPedido);
			 System.out.println("VALOR C/ PAGAMENTO A VISTA (com desconto de 5% =  " + valorComDesconto);
			 System.out.println("VALOR C/ PARCELAMENTO (em 3x) = " + valorParcelado);
			 
		 } else {
 
			 System.out.println("Código do pedido inválido. Pedido Encerrado");
			 ;
		 }
	}

}
