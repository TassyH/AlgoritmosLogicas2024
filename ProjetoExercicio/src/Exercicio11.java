import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro ladao do triangulo: ");
        double ladoUm = teclado.nextDouble();

        System.out.println("Entre com o primeiro ladao do triangulo: ");
        double ladoDois = teclado.nextDouble();
        double raiz = (ladoUm*ladoUm)+ (ladoDois*ladoDois);
        double hipo = Math.sqrt((ladoUm*ladoUm)+ (ladoDois*ladoDois));
        System.out.println("A hipotenusa dos lados do triangulo é "+hipo);

    }
}