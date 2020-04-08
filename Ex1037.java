import java.util.Scanner;

public class Ex1037 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor:");
		double n = scan.nextFloat();
		
		if(n>0 && n<=25){
			System.out.print("Intervalo [0,25]");
		}
		
		if(n>25 && n<=50){
			System.out.print("Intervalo [25,50]");
		}

		if(n>50 && n<=75){
			System.out.print("Intervalo [50,75]");
		}

		if(n>75 && n<=100){
			System.out.print("Intervalo [75,100]");
		}

	}

}