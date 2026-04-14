package ex01;

import java.util.List;
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		List<Integer> ListaNumeros = new ArrayList<>();
		
		ListaNumeros.add(54);
		ListaNumeros.add(34);
		ListaNumeros.add(32);
		ListaNumeros.add(4);
		ListaNumeros.add(19);
		ListaNumeros.sort(null);
		
		System.out.println(ListaNumeros);

	}

}
