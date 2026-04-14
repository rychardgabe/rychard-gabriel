package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

		public static void main(String[] args) {
	
			Scanner n = new Scanner(System.in);
			List<Double> numeros = new ArrayList<>();
			double v;
			
			System.out.println("Digite valores decimais:");
			
			while(true) {
				v = n.nextDouble();
				
				if(v == 0){
					break;
				}
				numeros.add(v);
			}
	        double menor = numeros.get(0);
	        double maior = numeros.get(0);
	        double soma = 0;
			for (double num : numeros) {
	            if (num < menor) {
	                menor = num;
	            }

	            if (num > maior) {
	                maior = num;
	            }

	            soma += num;
	        }

	        double media = soma / numeros.size();

	        System.out.println("Menor valor: " + menor);
	        System.out.println("Maior valor: " + maior);
	        System.out.println("Média: " + media);

	        n.close();

	}

}
