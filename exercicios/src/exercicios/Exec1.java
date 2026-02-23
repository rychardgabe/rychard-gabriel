package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DecimalFormat dec = new DecimalFormat("0.00");
		
		System.out.println("Inforem seu cadastro");
		int cad = input.nextInt();
		
		System.out.println("Informe seu nome");
		String n = input.next();
		
		System.out.println("Qual a quantidade de horas semanais foram trabalhadas?");
		double hs = input.nextDouble();
		
		System.out.println("Quanto você ganha por hora?");
		double vh = input.nextDouble();
		
		double sal = (hs * 4)* vh;
		
		System.out.println("Cadastro: " + cad + " Colaborador: " + n + " Salario: R$ " + dec.format(sal));

	}

}
