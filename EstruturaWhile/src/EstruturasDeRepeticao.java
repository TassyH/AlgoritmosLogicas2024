
public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 10;
		
		while(a<=1000) {
			System.out.println("loop 1: "+a);
			a++;
		}
		while (d <= 50 ) {
			System.out.println("loop 2: "+d);
			d++;
		}
		while (b <= 1000) {
			System.out.println("loop 3: "+b);
			b = b+5;
		}
		while(c >= 5) {
			System.out.println("loop 4: "+c);
			c--;
		}
	

}
}
