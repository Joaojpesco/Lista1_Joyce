import java.util.Scanner;

public class Ex1044{
	public static void main(String[] args){	
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		int a = scan.nextInt();
		System.out.print("Digite o segundo valor: ");
		int b = scan.nextInt();

		if(a%b==0){
			System.out.print("S�o multiplos");
		}else if(b%a==0){
			System.out.print("S�o multiplos");
		}else{
			System.out.print("N�o s�o multiplos");
		}
	}
}