import java.util.Scanner;

public class Ex1017 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("tempo gasto na viagem: ");
		double tempo = scan.nextDouble();
		System.out.print("velocidade média: ");
		double velocidade = scan.nextDouble();

		System.out.printf("Litros necessarios: %.3f",(velocidade*tempo)/12); 

	}
}
