import java.util.Scanner;

public class Ex1009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("Digite o seu nome: ");
		String nome = scan.next();

		System.out.print("Digite o salário fixo: ");
		double salario = scan.nextFloat();

		System.out.print("Digite a quantidade de vendas feitas no mes: ");
		double quant = scan.nextFloat();

		double result = (salario + (0.15*quant));

		System.out.printf("Salario final = %.2f",result);
	}
}