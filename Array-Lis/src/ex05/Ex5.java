package ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
	Scanner p = new Scanner(System.in);
	
	System.out.print("Digite uma palavra: ");
	String palavra = p.nextLine();
	
	List<Character> list = new ArrayList<Character>();
	
	for (char c : palavra.toCharArray()) {
		list.add(c);
		}
    List<Character> listaInvertida = new ArrayList<>(list);
    Collections.reverse(listaInvertida);

    if (list.equals(listaInvertida)) {
        System.out.println("É um palíndromo!");
    } else {
        System.out.println("Não é um palíndromo.");
    }
    p.close();

	}
}
