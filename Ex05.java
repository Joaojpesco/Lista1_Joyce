import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	
	System.out.println("Digite o primeiro valor: ");
	int a = scan.nextInt();

	System.out.println("Digite o segundo valor: ");
	int b = scan.nextInt();

	System.out.println("Resultado = " + (a+b)); 
    }
    
}