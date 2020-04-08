import java.util.Scanner;

public class Ex1020 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor: ");
		int a = scan.nextInt();
		int contAno = 0;
		int contMes = 0;
		for(int x = 0;;x++){
			if(a/30>0){
				contMes = contMes + 1;
				a = a - 30;
				if(contMes == 12){
					contAno = contAno + 1;
					contMes = 0;
					a = a - 5;
				}
			}else{
				break;
			}
		}
		System.out.printf("%d Ano(s)\n%d Mes(es)\n%d Dia(s)",contAno,contMes,a);
	}
}
