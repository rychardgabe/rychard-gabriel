package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<Integer> ListaNumeros = new ArrayList<>();
		
		ListaNumeros.add(54);
		ListaNumeros.add(34);
		ListaNumeros.add(32);
		ListaNumeros.add(4);
		ListaNumeros.add(19);
		ListaNumeros.sort(Collections.reverseOrder());
		
		System.out.println(ListaNumeros);

	}

}
