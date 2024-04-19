import java.util.Scanner;

public class ExercicioLista18 {
    public static void main(String[] args) {
       //Implementar um programa que recebe como parâmetro um número inteiro n 
        //e retorne 1 se ele for divisível por 3 ou por 5, mas 
        //não simultaneamente pelos dois, ou 0 caso contrário.

        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre com um número");
        int n = teclado.nextInt();

        if(n%3==0 || n%5==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
