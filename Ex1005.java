import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1005 {
	public static void main(String[] args) {
		DecimalFormat saida = new DecimalFormat("0.00000");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double n1 = scan.nextFloat();

		System.out.print("Informe a segunda nota: ");
		double n2 = scan.nextFloat();
		
		double media = (((n1*3.5) + (n2*7.5))/11);
		System.out.printf("Média = " + saida.format(media));
	}
}
