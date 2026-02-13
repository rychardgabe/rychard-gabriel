import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe uma idade");
		int id1 = input.nextInt();
		System.out.println("Informe outra idade");
		int id2 = input.nextInt();
		
		int somaId = id1 + id2;
		
		System.out.println("A soma das idades é: " + somaId + " anos");
		
		
		System.out.println("Informe um valor me reais");
		double v1 = input.nextDouble();
		System.out.println("Informe um segundo valor me reais");
		double v2 = input.nextDouble();
		
		double somaVl = v1 + v2;
		
		System.out.println("A soma dos valor dos valores é: " + "R$" + somaVl);
		
		System.out.println("Informe uma altura em metros");
		double a1 = input.nextDouble();
		System.out.println("Informe outra altura em metros");
		double a2 = input.nextDouble();
		
		double difAlt = a1 - a2;
		
		System.out.println("A diferença das alturas é de: " + difAlt + " metros" + " ou " + (difAlt *100) + " centimetros");
		
		System.out.println("Informe a altura de um retangulo");
		double alt = input.nextDouble();
		System.out.println("Informe a base de um retangulo");
		double b = input.nextDouble();
		
		double areaR = b * alt;
		double peR = 2*b + 2*alt;
		System.out.println("A area do retangulo é: " + areaR + " e o perimetro do retangulo é: " + peR);
		
		System.out.println("Informe seu nome");
		String n = input.next();
		System.out.println("Infrome seu sobrenome");
		String s = input.next();
		
		String nmC = n + " " + s;
		
		System.out.println("Seu nome completo é: " + nmC);
	
	}
	
}
