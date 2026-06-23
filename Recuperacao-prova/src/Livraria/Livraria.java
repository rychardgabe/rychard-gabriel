package Livraria;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
	
	private List<Livro> listaLivros;
	
	public Livraria() {
		listaLivros = new ArrayList<Livro>();
	}
	public Livro obterLivroPorIBSN(String isbn) {
		if(isbn == null || isbn.length() != 20 && isbn.length() != 13) {
		throw new IllegalArgumentException("ISBN inválido");
		}
		for(Livro l : listaLivros) {
			if(l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}
	
	public Livro obterLivroMaisCaroAnoP(int ano) {

		Livro livroMaisCaro = null;
		double maisCaro = 0;
		

		for (Livro l : listaLivros) {
			if (l.getDatapubli(). && l.getPreco() > maisCaro) {
				maisCaro = l.getPreco();
				livroMaisCaro = l;
			}

		}

		return livroMaisCaro;
	}
	
	public List<Livro> listarLivroAutor(String autor, double precoMinimo, double precoMaximo){
		
		List<Livro> listaLivrosPorAnoEPreco = new ArrayList<Livro>();
		
		for(Livro l : listaLivros) {
			if(l.getAutor().equals(autor) && (l.getPreco() >= precoMinimo && l.getPreco() <= precoMaximo)){
				listaLivrosPorAnoEPreco.add(l);
			}
		}
		return listaLivrosPorAnoEPreco;
	}
	
	public void adicionarLivro(Livro l) {
		listaLivros.add(l);
	}
	
	public List<Livro> getListaLivors() {
		return this.listaLivros;
	}
}
