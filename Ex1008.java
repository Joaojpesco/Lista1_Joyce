import java.util.Scanner;

public class Ex1008 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Numero do trabalhador: ");
		int num = scan.nextInt();
	
		System.out.print("Informe a quantidade de horas trabalhadas: ");
		int horas = scan.nextInt();
		
		System.out.print("Valor por hora trabalhada: ");
		double valor = scan.nextDouble();
		
		double salario = (horas * valor);		
		
		System.out.printf("numero = %d\n",num);
		System.out.printf("Salario = R$ %.2f",salario);

	}


}
