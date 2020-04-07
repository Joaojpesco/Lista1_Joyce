import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1006 {
	public static void main(String[] args) {
		DecimalFormat saida = new DecimalFormat("0.0");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double n1 = scan.nextFloat();

		System.out.print("Informe a segunda nota: ");
		double n2 = scan.nextFloat();

		System.out.print("Informe a terceira nota: ");
		double n3 = scan.nextFloat();
		
		double media = (((n1*2) + (n2*3) + (n3*5))/10);

		System.out.printf("Média = " + saida.format(media));
	}
}