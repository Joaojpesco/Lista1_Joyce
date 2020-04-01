import java.util.Scanner;

public class Ex1002 {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double raio = scan.nextInt();
			
		System.out.print("Area do circulo = " + (3.14159 * (raio*raio)));
	}
}
