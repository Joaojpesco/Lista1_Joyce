import java.util.Scanner;


public class Ex1015 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Informe o valor de x: ");
		double x = scan.nextDouble();

		System.out.print("Informe o valor de x2: ");
		double xz = scan.nextDouble();

		System.out.print("Informe o valor de y: ");
		double y = scan.nextDouble();

		System.out.print("Informe o valor de y2: ");
		double yz = scan.nextDouble();


		
		double resultado = Math.sqrt(Math.pow(xz - x,2) + Math.pow(yz - y,2));

		System.out.printf("A distancia entre os pontos é: %.4f",resultado);
	}

}