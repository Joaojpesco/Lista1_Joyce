import java.util.Scanner;

public class Ex1013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor de A: ");
		int a = scan.nextInt();

		System.out.print("Informe o valor de B: ");
		int b = scan.nextInt();

		System.out.print("Informe o valor de C: ");
		int c = scan.nextInt();

		double maior = ((a + b + Math.abs(a - b))/2);
		double maior2 = ((maior + c + Math.abs(maior - c))/2); 
	
		System.out.printf("o maior entre %d, %d e %d é  %.2f",a,b,c,maior2);
		
	}


}
