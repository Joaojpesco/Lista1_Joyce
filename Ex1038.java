import java.util.Scanner;

public class Ex1038 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Código            Produto                   Valor\n");
		System.out.printf("  1            Cachorro quente              R$ 4.00\n");
		System.out.printf("  2            X Salada                     R$ 4.50\n");
		System.out.printf("  3            X Bacon                      R$ 5.00\n");
		System.out.printf("  4            Torrada simples              R$ 2.00\n");
		System.out.printf("  5            Refrigerante                 R$ 1.50\n");

		System.out.print("Digite o código do produto: ");
		int c = scan.nextInt();
		System.out.print("Digite quantidade: ");
		int quant = scan.nextInt();
		double valor;
		switch(c){
			case 1:
			valor = 4;
			System.out.printf("Valor: %.2f reais",(valor*quant));
			break;
			case 2:
			valor = 4.50;
			System.out.printf("Valor: %.2f reais",(valor*quant));
			break;
			case 3:
			valor = 5;
			System.out.printf("Valor: %.2f reais",(valor*quant));
			break;
			case 4:
			valor = 2;
			System.out.printf("Valor: %.2f reais",(valor*quant));
			break;
			case 5:
			valor = 1.50;
			System.out.printf("Valor: %.2f reais",(valor*quant));
			break;
		}
		
		
	}


}