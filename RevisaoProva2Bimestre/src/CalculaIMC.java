import java.util.Random;
import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		 // Criando o array de dados
        double[] dados = new double[2];

        // Gerando dados aleatórios para altura e peso
        Random geradorAleatorio = new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("numero de pessoas para calcular o IMC");
        int pessoas = scan.nextInt();// ele vai gerar o calculo do imc pra essas quantidades de pessoas
        
            double[] pesos = new double[pessoas];
            double[] alturas = new double[pessoas];
            double[] imcs = new double[pessoas];
            
            Random random = new Random();
            
            // Gerar pesos e alturas aleatórios
            for (int i = 0; i < pessoas; i++) {
                pesos[i] = 50 + (50 * random.nextDouble());
                alturas[i] = 1.5 + (0.5 * random.nextDouble());
            }
            
            // Calcular IMCs
            for (int i = 0; i < pessoas; i++) {
                imcs[i] = pesos[i] / (alturas[i] * alturas[i]);
            }
            
            // Exibir pesos, alturas e IMCs
            System.out.println("Peso (kg) | Altura (m) | IMC");
            System.out.println("----------------------------");
            for (int i = 0; i < pessoas; i++) {
                System.out.printf("%.2f     | %.2f      | %.2f\n", pesos[i], alturas[i], imcs[i]);
            }
    }

    

}
