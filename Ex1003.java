import java.util.Scanner;

public class Ex1003 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int a = scan.nextInt();

		System.out.print("Digite o segundo valor: ");
		int b = scan.nextInt();

		int soma = (a+b);
		
		System.out.print("Resultado = " + soma);
	}
}