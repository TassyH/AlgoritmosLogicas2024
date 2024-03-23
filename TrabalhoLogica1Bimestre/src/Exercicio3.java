import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*[1,0] Criar um programa para uma lanchonete Chinesa para calcular os itens
		consumidos. A referida lanchonete acabou de chegar ao Brasil e situa-se no interior de
		MG. Lembre-se que MG é diferente de MT*/

		Scanner teclado = new Scanner (System.in);
		System.out.println("  CÓDIGO  |    DESCRIÇÃO                          | VALOR  ");
		System.out.println(" -----------------------------------------------------------");
		System.out.println("    14    | Morcego frito                         | R$ 15,50 ");
		System.out.println("    26    | Ensopado de grilo                     | R$ 25,00");
		System.out.println("    38    | Barata a dorê                         | R$ 12,00");
		System.out.println("    46    | Cérebro de macaco com páprica defumada| R$ 67,00");
		
		System.out.println("Entre com o código do seu pedido :)");
		int codPedido = teclado.nextInt();
		switch (codPedido) {
		case 14: {
			System.out.println("Seu pedido foi: Morcego frito");
			System.out.println("");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + codPedido);
		}
		



	}

}
