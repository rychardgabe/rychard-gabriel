import java.util.Scanner;

public class exec2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
       System.out.println("Digite o nome do colega:");
       String nome = input.next();
       if (nome.equals("rychard")) {
       	rychard();
       } else if (nome.equals("maria")) {
           maria();
       } else {
           System.out.println("Colega não encontrado.");
       }
	}
	
	public static void maria() {
       System.out.println("O nome dela é Maria");
       System.out.println("Ela tem 16 anos");
       System.out.println("Ela é estudante de desenvolvimento de sistemas");
	}
	public static void rychard() {
       System.out.println("O nome dele é Rychard");
       System.out.println("Ela tem 18 anos");
       System.out.println("Ele é estudante de desenvolvimento de sistemas");
	}

}
