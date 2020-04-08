import java.util.Scanner;

public class Ex1064 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		double a = scan.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double b = scan.nextDouble();
		System.out.print("Digite o Terceiro valor: ");
		double c = scan.nextDouble();
		System.out.print("Digite o Quarto valor: ");
		double d = scan.nextDouble();
		System.out.print("Digite o Quinto valor: ");
		double e = scan.nextDouble();
		System.out.print("Digite o Sexto valor: ");
		double f = scan.nextDouble();
		int x = 0;
		double media = 0;
		if(a>0){
			x = x + 1;
			media = media + a;
		}
		if(b>0){
			x = x + 1;
			media = media + b;
		}
		if(c>0){
			x = x + 1;
			media = media + c;
		}
		if(d>0){
			x = x + 1;
			media = media + d;
		}
		if(e>0){
			x = x + 1;
			media = media + e;
		}
		if(f>0){
			x = x + 1;
			media = media + f;
		}
		System.out.print("Numeros positivos: " + x);
		System.out.printf("\nMedia: %.2f",media/x);
	}

}