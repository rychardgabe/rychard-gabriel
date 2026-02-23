package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.println("Informe seu nome");
		String n = input.next();
		
		System.out.println("Informe seu salario fixo");
		double salf = input.nextDouble();
		
		System.out.println("Qual foi o total de venda no mês?(em valor)");
		double vendm = input.nextDouble();
		
		double p = (vendm * 15) /100;
		
		double vendt = salf + vendm + p;
		
	
		System.out.println("você recebeu no mês R$" + vendt);

	}

}
