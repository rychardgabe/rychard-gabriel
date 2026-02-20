package exercicios;

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inforem seu cadastro");
		int cad = input.nextInt();
		
		System.out.println("Informe seu nome");
		String n = input.next();
		
		System.out.println("Qual a quantidade de horas trabalhadas?");
		double h = input.nextDouble();
		
		System.out.println("Quanto você ganha por hora?");
		double vh = input.nextDouble();
		
		double sal =  h * vh;
		
		System.out.println("salario: " + sal);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");

	}

}
