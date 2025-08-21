import java.util.Scanner;

public class Welcome1{		// método principal inicia a execução do aplicativo Java

	public static void main( String args[] ){

	System.out.println( "Welcome to Java Programming!" );
	int opt = 1;
	int saldo = 5000;
	do{
	System.out.println("======BANCO======");
	Scanner input  = new Scanner(System.in);
	System.out.pŕintln("1. Ver dinheiros");
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

	default:
	System.out.println("Erro!");
	break;





}
	}while (opt != 0);
	}		// fim do método principal
}		// fim da classe Welcome1
