import java.util.Scanner;

public class Exercicio12 {
        
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
          
          System.out.println("Entre com os segundos: ");
          int segundos = teclado.nextInt();

          double minutos = segundos/60;
          double hora = minutos/60;

          System.out.println(segundos+" segundos em minutos: "+minutos);
          System.out.println(segundos+" segundos em horas: "+hora);


      }
  }
