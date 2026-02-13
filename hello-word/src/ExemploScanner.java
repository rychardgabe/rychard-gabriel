import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira seu nome");
		String nome = input.next();
		
		System.out.println("Insira sua idade");
		int id = input.nextInt();
		
		System.out.println("Seu nome é " + nome + " e sua idade é " + id + " anos");
		

	}

}
