import java.util.Scanner;

public class Ex1036 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de A");
		double a = scan.nextDouble();

		System.out.print("Digite o valor de B");
		double b = scan.nextDouble();

		System.out.print("Digite o valor de C");
		double c = scan.nextDouble();

		double delta = ((Math.pow(b,2))-(4*a*c));
		
		System.out.printf("Delta = %.0f\n",delta);

		double x1 = (-b + Math.sqrt(delta));
		double x2 = (-b - Math.sqrt(delta));
		
		System.out.printf("x1 = %.2f\n",(x1/2*a));
		System.out.printf("x2 = %.2f\n",(x2/2*a));
	}

}
