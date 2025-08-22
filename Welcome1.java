import java.util.Scanner;

public class Welcome1{

	public static void main( String args[] ){

		System.out.println( "Welcome to Java Programming!" );
		int opt = 1;
		int saldo = 5000;
		do{
			if(saldo <= 0){
				opt = 0;
			}
			System.out.println("======BANCO======");
			Scanner input = new Scanner(System.in);
			System.out.println("1. Ver dinheiros");
			System.out.println("2. Depositar na conta");
			System.out.println("3. Fazer uma compra");
			opt = input.nextInt();
	
			switch(opt){

				case 1:
				System.out.println("Saldo: "+saldo);
				break;

				case 2:
				System.out.println("Digite o valor a ser somado: ");
				int dep = input.nextInt();
				saldo += dep;
				break;

				case 3:
				System.out.println("Digite o valor a ser subtraido: ");
				int comp = input.nextInt();
				saldo -= comp;
				break;

				case 0:
				System.out.println("Saindo...");
				break;

				default:
				System.out.println("Erro!");
				break;

			}
		}while (opt != 0);
	}
}
