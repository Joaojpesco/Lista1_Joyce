import java.util.Scanner;

public class Ex1007 {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);	
	System.out.print("Informe o valor de A: ");
	int a = scan.nextInt();

	System.out.print("Informe o valor de B: ");
	int b = scan.nextInt();

	System.out.print("Informe o valor de C: ");
	int c = scan.nextInt();

	System.out.print("Informe o valor de D: ");
	int d = scan.nextInt();

	int dife = ((a*b) - (c*d));
	
	System.out.printf("Resultado = %d",dife);
	}


}
