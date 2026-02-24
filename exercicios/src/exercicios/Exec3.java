package exercicios;

import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe sua altura");
		double alt = input.nextDouble();
		
		System.out.println("Informe seu peso em quilos");
		double pe = input.nextDouble();
		
		double imc = pe / (alt * alt);
		
		if(imc < 18.5) {
			System.out.println("Magreza");
		}else if(imc > 18.5 & imc < 24.9) {
			System.out.println("Saudável");
		}else if(imc > 25.0 & imc < 29.9 ) {
			System.out.println("Sobrepeso");
		}else if(imc > 30.0 & imc < 34.9) {
			System.out.println("Obesidade Grau I");
		}else if (imc > 35.0 & imc < 39.9) {
			System.out.println("Obesidade Grau II (severa)");
		}else if(imc > 40.0) {
			System.out.println("Obesidade Grau III (morbida)");
		}
	}

}
