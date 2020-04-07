import java.util.Scanner;

public class Ex1010 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o código do objeto: ");
		int c1 = scan.nextInt();

		System.out.print("Informe a quantidade de objetos: ");
		int quant1 = scan.nextInt();

		System.out.print("Informe o valor do objeto: ");
		double v1 = scan.nextDouble();

		System.out.print("Informe o código do objeto 2: ");
		int c2 = scan.nextInt();

		System.out.print("Informe a quantidade de objetos: ");
		int quant2 = scan.nextInt();

		System.out.print("Informe o valor do objeto 2: ");
		double v2 = scan.nextDouble();

		double resultado = ((quant1*v1) + (quant2*v2));

		System.out.printf("Valor a pagar = %.2f",resultado);
	}

}