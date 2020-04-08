import java.util.Scanner; 

public class Ex1019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor: ");
		int a = scan.nextInt();
		int contMinutos = 0;
		int contHoras = 0;
		for(;;){
			if(a/60>0){
				contMinutos = contMinutos + 1;
				if(contMinutos == 60){
					contHoras = contHoras + 1;
					contMinutos = 0;
				}
				a = a - 60;
			}else{
				break;
			}
		}
		
		System.out.printf("horas = %d, minutos = %d, segundos = %d",contHoras,contMinutos,a);
	}
}
