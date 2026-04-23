package ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(55);
		numeros.add(54);
		numeros.add(345);
		numeros.add(36);
		numeros.add(24);
		
		System.out.println("Digite um numero");
		int numero = n.nextInt();
		
		if(numeros.contains(numero)) {
			int indice = numeros.indexOf(numero);
            System.out.println("Número encontrado!");
            System.out.println("Índice: " + indice);
		}else {
			 System.out.println("Número não encontrado na lista.");
		}
		n.close();
	}

}
