import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*[1,0] Criar um programa para uma lanchonete Chinesa para calcular os itens
		consumidos. A referida lanchonete acabou de chegar ao Brasil e situa-se no interior de
		MG. Lembre-se que MG é diferente de MT*/

		double calcPedido = 0;
		double desconto = 0;
		double valorComDesconto = 0;
		double valorParcelado = 0;
		Scanner teclado = new Scanner (System.in);
		System.out.println("  CÓDIGO  |    DESCRIÇÃO                          | VALOR  ");
		System.out.println(" -----------------------------------------------------------");
		System.out.println("    14    | Morcego frito                         | R$ 15,50 ");
		System.out.println("    26    | Ensopado de grilo                     | R$ 25,00");
		System.out.println("    38    | Barata a dorê                         | R$ 12,00");
		System.out.println("    46    | Cérebro de macaco com páprica defumada| R$ 67,00");
		
		/*Em seguida, o programa (baseado na tabela anterior) deverá informar a descrição
do produto, o valor total, o valor à vista com desconto de 5% e o valor parcelado
em 3X no cartão sem juros.
*/
		
		System.out.println("Entre com o código do seu pedido :)");
		int codPedido = teclado.nextInt();
		System.out.println("Entre com a quantidade :)");
		int qtdPedido = teclado.nextInt();
		switch (codPedido) {
		case 14: {
			System.out.println("Seu pedido foi: Morcego frito");
			calcPedido = qtdPedido * 15.50;
			System.out.println("O valor do pedido é "+calcPedido);
			desconto = calcPedido*0.05;
			valorComDesconto = (calcPedido - desconto);
			System.out.println("valor a vista (com desconto de 5% =  "+valorComDesconto);
			valorParcelado = calcPedido / 3;
			System.out.print("O valor parcelado (em 3x) "+valorParcelado);
			
		}
		case 26:{
			System.out.println("Seu pedido foi: Morcego frito");
			calcPedido = qtdPedido * 25.00;
			System.out.println("O valor do pedido é "+calcPedido);
			desconto = calcPedido*0.05;
			valorComDesconto = (calcPedido - desconto);
			System.out.println("valor a vista (com desconto de 5% =  "+valorComDesconto);
			valorParcelado = calcPedido / 3;
			System.out.println("O valor parcelado (em 3x) "+valorParcelado);
		}
		case 38:{
			System.out.println("Seu pedido foi: Morcego frito");
			calcPedido = qtdPedido * 12.00;
			System.out.println("O valor do pedido é "+calcPedido);
			desconto = calcPedido*0.05;
			valorComDesconto = (calcPedido - desconto);
			System.out.println("valor a vista (com desconto de 5% =  "+valorComDesconto);
			valorParcelado = calcPedido / 3;
			System.out.println("O valor parcelado (em 3x) "+valorParcelado);
		}
		case 46:{
			System.out.println("Seu pedido foi: Morcego frito");
			calcPedido = qtdPedido * 67.00;
			System.out.println("O valor do pedido é "+calcPedido);
			desconto = calcPedido*0.05;
			valorComDesconto = (calcPedido - desconto);
			System.out.println("valor a vista (com desconto de 5% =  "+valorComDesconto);
			valorParcelado = calcPedido / 3;
			System.out.println("O valor parcelado (em 3x) "+valorParcelado);
		}
		default: System.out.println("Código do pedido inválido");;
		}
		



	}

}
