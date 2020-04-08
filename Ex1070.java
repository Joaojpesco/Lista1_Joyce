import java.util.Scanner;

public class Ex1070 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int num = scan.nextInt();
		int b = num+ 12;
		for(int x = num;num<b;x++,num++){
			if(x%2!=0){
				System.out.printf("%d\n",x);
			}
		}
	}
}