import java.util.Scanner;

public class Ex1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o raio da esfera: ");
		int raio = scan.nextInt();

		double resultado = ((4.0/3) * 3.14159 * (raio*raio*raio));

		System.out.printf("A area da esfera é %.3f",resultado);
	}

}