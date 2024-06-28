import java.util.Scanner;

public class ExercicioFatoracao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int fator = 1;
		System.out.println("entre com o numero que deseja descobrir o fatorial");
		int numFat = scan.nextInt();
		//int i = 1;
		int laco = 1;
		
		
		  for (int i = 1; i <= numFat; i++) {
	            fator *= i;
				System.out.println(i);

	        }
		
		
		System.out.println(fator);
	}

}
