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
			verao();
		}
		else if(e == 2) {
			outono();
		}
		else if(e == 3) {
			iverno();
		}
		else if(e == 4) {
			primavera();
		}
	}
	public static void verao() {
		System.out.println("É verão");
	}
	public static void outono() {
		System.out.println("As folas caem");
	}
	public static void iverno() {
		System.out.println("É inverno");
	}
	public static void primavera() {
		System.out.println("As flores desabrocham");
	}

}
