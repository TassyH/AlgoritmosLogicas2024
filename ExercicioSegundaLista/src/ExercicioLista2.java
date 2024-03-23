import java.util.Scanner;

public class ExercicioLista2 {

	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		double calculoReajuste;

		System.out.println("Entre com seu salário");
		double salario = teclado.nextDouble();
		if(salario <= 500.00) {
			System.out.println("vc tem direito ao seu reajuste");
			calculoReajuste = (salario * 0.30) +salario;
			System.out.println("seu salario reajuste vai mudar para:"+calculoReajuste);
		}else if(salario >500.00){
			System.out.println("infelizmente vc nao tem direito reajuste :(");
			}
		}
}
