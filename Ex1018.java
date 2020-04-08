import java.util.Scanner;


public class Ex1018 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor: ");
		int a = scan.nextInt();
		int cont100 = 0;
		int cont50 = 0;
		int cont20 = 0;
		int cont10 = 0;
		int cont5 = 0;
		int cont2 = 0;
		int cont1 = 0;
		for(int x = 0;;x++){
			if(a/100>0){
				cont100 = cont100 + 1;
				a = a - 100;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 100,00\n",cont100);
		for(int x = 0;;x++){
			if(a/50>0){
				cont50 = cont50 + 1;
				a = a - 50;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 50,00\n",cont50);
		for(int x = 0;;x++){
			if(a/20>0){
				cont20 = cont20 + 1;
				a = a - 20;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 20,00\n",cont20);
		for(int x = 0;;x++){
			if(a/10>0){
				cont10 = cont10 + 1;
				a = a - 10;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 10,00\n",cont10);
		for(int x = 0;;x++){
			if(a/5>0){
				cont5 = cont5 + 1;
				a = a - 5;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 5,00\n",cont5);
		for(int x = 0;;x++){
			if(a/2>0){
				cont2 = cont2 + 1;
				a = a - 2;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 2,00\n",cont2);
		for(int x = 0;;x++){
			if(a/1>0){
				cont1 = cont1 + 1;
				a = a - 1;
			}else{
				break;
			}
		}
		System.out.printf("%d nota(s) de R$ 1,00\n",cont1);
	}
}