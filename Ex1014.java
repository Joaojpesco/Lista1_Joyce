import java.util.Scanner;

public class Ex1014 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Distancia percorrida: ");
		double dist = scan.nextDouble();
		
		System.out.print("Combustivel gasto: ");
		double comb = scan.nextDouble();

		System.out.printf("\nConsumo médio = %.3f",dist/comb);
	}
}
