/**
 * ExercicioLista20
 */
import java.util.Scanner;

public class ExercicioLista20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("entre com o seu salario");
        double salario = teclado.nextDouble();
        System.out.println((salario > 10.500 ) ? "fica quietino":"procura outro trampo");

        System.out.println("entre com a quantidade de titulos que o time tem");
        int titulos = teclado.nextInt();
        System.out.println((titulos > 3 ) ? "melhor do Brasil!":"precisamos investir mais");

        System.out.println("entre com um valor");
        double valor = teclado.nextInt();
        System.out.println((valor > 1500 ) ? true:false);
    }
}