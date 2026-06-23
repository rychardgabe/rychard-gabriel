package Livraria;

import java.time.LocalDate;

public class Livro {
	
	private String titulo;
	private String autor;
	private String isbn;
	private LocalDate datapubli;
	private int preco;
	private LocalDate dataempre;
	
	public Livro(String titulo, String autor, String isbn, LocalDate datapubli, int preco, LocalDate dataempre) {
		setTitulo(titulo);
		setAutor(autor);
		setIsbn(isbn);
		setDatapubli(datapubli);
		setPreco(preco);
		setDataempre(dataempre);
	}
	
	public double calcularMultaAtraso(int anoAlvo) {
		
	}


	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
			throw new IllegalArgumentException("Titulo inválido");
		}
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		if (autor == null || autor.isBlank()) {
			throw new IllegalArgumentException("Autor inválido");
			}
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		if(isbn == null || isbn.length() != 20 && isbn.length() != 13) {
			throw new IllegalArgumentException("ISBN inválido");
		}
		this.isbn = isbn;
	}
	public LocalDate getDatapubli() {
		return datapubli;
	}
	public void setDatapubli(LocalDate datapubli) {
		if (datapubli.isAfter(LocalDate.now()) ) {
			throw new IllegalArgumentException("Ano inválido");
		}
		this.datapubli = datapubli;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("Preço inválido");
		}
		this.preco = preco;
	}
	public LocalDate getDataempre() {
		return dataempre;
	}
	public void setDataempre(LocalDate dataempre) {
		if (dataempre.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Data de emprestimo inválida");
		}
		this.dataempre = dataempre;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + isbn + ", Data Publicação=" + datapubli + ","
				+ " preco=" + preco + "]";
	}
	
	
	
}
