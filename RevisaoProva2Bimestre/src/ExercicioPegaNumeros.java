import java.util.Scanner;

public class ExercicioPegaNumeros {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int antes = 0;
		int depois = 0;
		boolean controla = true;
		int num = 0;
		int i = 0;
		while (controla) {
			System.out.println("entre com o numero que deseja descobrir ");
			num = scan.nextInt();
			
			
			
			if(num < 0) {
				controla = false;
				System.out.println("programa encerrado");

			}else {
				antes = num - 1;
				depois = num + 1;
				
				System.out.println("numero anterior do "+num+ " é: "+antes);
				System.out.println("numero anterior do "+num+ " é: "+depois);
			}
		}
		
		

	}

}
