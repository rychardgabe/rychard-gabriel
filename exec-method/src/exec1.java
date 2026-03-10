import java.util.Scanner;

public class exec1 {

	public static void main(String[] args) {
		mostrarEstacoes();
	}
	
	public static void mostrarEstacoes() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um valor de 1 à 4");
		int e = input.nextInt();
		
		if(e == 1) {
			imprimirverao();
		}
		else if(e == 2) {
			imprimiroutono();
		}
		else if(e == 3) {
			imprimiriverno();
		}
		else if(e == 4) {
			imprimirprimavera();	
		}
	}
	public static void imprimirverao() {
		System.out.println("É verão");
	}
	public static void imprimiroutono() {
		System.out.println("As folas caem");
	}
	public static void imprimiriverno() {
		System.out.println("É inverno");
	}
	public static void imprimirprimavera() {
		System.out.println("As flores desabrocham");
	}

}
