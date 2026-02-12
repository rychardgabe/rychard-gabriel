import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {

		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner input = new Scanner(System.in);

		System.out.println("Insira seu nome");
		String nome = input.next();

		System.out.println("Insira sua idade");
		int idade = input.nextInt();

		System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos");

	}

}
