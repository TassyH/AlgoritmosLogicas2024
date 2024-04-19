import java.util.Scanner;

public class ExercicioLista19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		double somaItens = 0;
        double calcDesconto = 0;
		System.out.println("CÓDIGO DO PRODUTO  |  PREÇO");
        System.out.println("-----------------------------");
        System.out.println("      1 a 10       |  R$ 10");
        System.out.println("     11 A 20       |  R$ 15");
		System.out.println("     21 A 30       |  R$ 20");
        System.out.println("     31 A 40       |  R$ 30");

        System.out.println(">>>>> entre com o cod do produto");
        int produto = teclado.nextInt();
        System.out.println("Entre com a quantidade do produto");
        int quantidade = teclado.nextInt();

        if(produto >= 1 && produto <=10){
            somaItens = quantidade*10;
        }else if(produto >=11 && produto <=20){
            somaItens = quantidade*15;
        }else if(produto >=21 && produto <= 30){
            somaItens = quantidade*20;
        }else if(produto >= 31 && produto <=40){
            somaItens = quantidade*30;
        }

        if (somaItens <= 250) {
            calcDesconto = somaItens - (somaItens*0.05);
            System.out.println("O preço final de sua compra é de R$ "+calcDesconto);
        }else if(somaItens > 250 && somaItens <=500 ){
            calcDesconto = somaItens - (somaItens*0.10);
            System.out.println("O preço final de sua compra é de R$ "+calcDesconto);
        }else{
            calcDesconto = somaItens - (somaItens*0.20);
            System.out.println("O preço final de sua compra é de R$ "+calcDesconto);
        }


    }
}
