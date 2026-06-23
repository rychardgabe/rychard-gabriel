package Livraria;

import java.time.LocalDate;

public class Livro_main {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("Clean Code", "Robert C Martin", "9780132350884", LocalDate.of(2008, 10, 5), 210, LocalDate.of(2026, 2, 4));
		Livro l2 = new Livro("Effective Java", "Joshua Bloch", "JKM97801346859919B12", LocalDate.of(2018, 3, 9), 380, LocalDate.of(2026, 5, 9));
		Livro l3 = new Livro("Head First JavaScrip", "Eric Freeman", "9780321125217", LocalDate.of(2014, 1, 18), 340, LocalDate.of(2026, 2, 11));
		Livro l4 = new Livro("Java Concurrency in Practice", "Brian Goetz", "9780321349606", LocalDate.of(2006, 6, 22), 79, LocalDate.of(2026, 3, 10));
		Livro l5 = new Livro("Head First Design Patterns", "Eric Freeman", "9780596007126", LocalDate.of(2014, 5, 20), 58, LocalDate.of(2026, 3, 24));

		Livraria l = new Livraria();
		
		l.adicionarLivro(l1);
		l.adicionarLivro(l2);
		l.adicionarLivro(l3);
		l.adicionarLivro(l4);
		l.adicionarLivro(l5);
		
		System.out.println(l.obterLivroPorIBSN("9780132350884"));
		
		System.out.println(l.obterLivroMaisCaroAnoP(2014));
		
		System.out.println(l1.calcularMultaAtraso(2028));

		
	}
	


}
