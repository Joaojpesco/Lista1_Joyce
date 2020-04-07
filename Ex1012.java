import java.util.Scanner;

public class Ex1012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o valor de A: ");
		double a = scan.nextDouble();

		System.out.print("Informe o valor de B: ");
		double b = scan.nextDouble();

		System.out.print("Informe o valor de C: ");
		double h = scan.nextDouble();

		System.out.printf("\nTriangulo: %.3f\n",(a*h)/2);
		System.out.printf("Circulo: %.3f\n",3.14159 * (h*h));
		System.out.printf("Trapezio: %.3f\n",((a+b)*h)/2);
		System.out.printf("Quadrado: %.3f\n",b*b);
		System.out.printf("Retangulo: %.3f\n",a*b);
	}
}