import java.util.Scanner;

public class Ex1035 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de A ");
		int a = scan.nextInt();
	
		System.out.print("Digite o valor de B ");
		int b = scan.nextInt();

		System.out.print("Digite o valor de C ");
		int c = scan.nextInt();

		System.out.print("Digite o valor de D ");
		int d = scan.nextInt();

		if(b>c && d>a && (c+d > a+b) && (c>0 && d>0) && (a%2==0)){
			System.out.print("Valores aceitos");
		}else{
			System.out.print("Valores não aceitos");
		}
	}
}