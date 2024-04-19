import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Criar um programa para testar a execução de 4 operações que calculam a média
entre 3 notas. Se o usuário:
• digitar 1, então o programa deverá calcular a média geométrica;
• digitar 2, então o programa deverá calcular a média ponderada;
• digitar 3, então o programa deverá calcular a média harmônica;
• digitar 4, então o programa deverá calcular a média aritmética;*/
		
Scanner teclado = new Scanner (System.in);
double mediaPonderada = 0;
double mediaGeometrica = 0;
double mediaHarmonica = 0;
double mediaAritmetica = 0;
double x,y,z;

System.out.println("Escolha uma das operações para calcular a média:");
System.out.println("----------------------------------------------------");
System.out.println("OPERAÇÃO  |       MÉDIA       |    FORMULA   ");
System.out.println("   1      |  MÉDIA GEOMÉTRICA |    √xy  ");
System.out.println("   2      |  MÉDIA PONDERADA  | (x+2 * y+3 * z)/6");
System.out.println("   3      |  MÉDIA HARMONICA  | 3/(1/x + 1/y + 1/z)");
System.out.println("   4      |  MÉDIA ARITMÉTICA |   a(x,y)=x+y2 ");
System.out.println("----------------------------------------------------");
int operacao = teclado.nextInt();

System.out.println("-----------------------------------------------------");


if(operacao == 1) {
	
	System.out.println("Entre com os valores dos 3 valores");
	System.out.println("VALOR 1: ");
	x = teclado.nextDouble();
	System.out.println("VALOR 2: ");
	y = teclado.nextDouble();
	System.out.println("VALOR 3: ");
	z = teclado.nextDouble();
	
	mediaGeometrica = Math.pow((x*y*z), (1.0/3.0));
	System.out.println("A média geométrica dos valores informados é = "+mediaGeometrica);
	
}else if(operacao ==2) {
	
	System.out.println("Entre com os valores dos 3 valores");
	System.out.println("VALOR 1: ");
	x = teclado.nextDouble();
	System.out.println("VALOR 2: ");
	y = teclado.nextDouble();
	System.out.println("VALOR 3: ");
	z = teclado.nextDouble();
	
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("para calcular a média ponderada, vc precisa informar o valor dos pesos");
	System.out.println("Entre com os pesos de cada um dos valores informados anteriormente:");
	System.out.println("Peso do valor 1: ");
	double peso1 = teclado.nextDouble();
	System.out.println("Peso do valor 2: ");
	double peso2 = teclado.nextDouble();
	System.out.println("Peso do valor 3: ");
	double peso3 = teclado.nextDouble();
	
	double calcPeso = x*peso1 + y*peso2 + z*peso3;
	double somaPeso = peso1+peso2+peso3;
	mediaPonderada = calcPeso/somaPeso;
	System.out.println("A média ponderada dos valores informados é = "+mediaPonderada);
	
}
else if(operacao == 3) {
	
	System.out.println("Entre com os valores dos 3 valores");
	System.out.println("VALOR 1: ");
	x = teclado.nextDouble();
	System.out.println("VALOR 2: ");
	y = teclado.nextDouble();
	System.out.println("VALOR 3: ");
	z = teclado.nextDouble();
	
	double calcInverso = 1/x + 1/y + 1/z;
	mediaHarmonica = 3/calcInverso;
	System.out.println("A média harmonica dos valores informados é = "+mediaHarmonica);
	
}else if(operacao ==4) {
	
	System.out.println("Entre com os valores dos 3 valores");
	System.out.println("VALOR 1: ");
	x = teclado.nextDouble();
	System.out.println("VALOR 2: ");
	y = teclado.nextDouble();
	System.out.println("VALOR 3: ");
	z = teclado.nextDouble();
	
	mediaAritmetica = (x+y+z)/3;
	System.out.println("A média aritmética dos valores informados é = "+mediaAritmetica);
}else {
	System.out.println("OPÇÃO INVÁLIDA! PFV TENTE NOVAMENTE");
}
	}

}
