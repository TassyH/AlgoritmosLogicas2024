import java.util.Scanner;

public class ExecicioQuatro{
public static void main(String[] args) {
    
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("entre com o ultimo nome");
    String a = teclado.nextLine(); 

    System.out.println("entre com o primeiro nome");
    String b = teclado.nextLine();
    
    String backup = a;
    a = b;
    System.out.println("o novo valor de A é: "+a);    
    System.out.println("O novo valor de B é: "+backup);



 }
}