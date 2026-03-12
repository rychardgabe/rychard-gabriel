package Mercado;

public class cadastroProd {

	public static void main(String[] args) {
		Mercado unidadeBlumenau = new Mercado();
		
		unidadeBlumenau.nMercado = "unidadeDeBlumenau";
		unidadeBlumenau.vedMac = 100000;
		unidadeBlumenau.precMac = 3.79;
		unidadeBlumenau.vendLar = 100000;
		unidadeBlumenau.precLar = 4.99;
		
		Mercado unidadeDeJoinville = new Mercado();
		
		unidadeDeJoinville.nMercado = "unidadeDeJoinville";
		unidadeDeJoinville.vedMac = 350000;
		unidadeDeJoinville.precMac = 2.89;
		unidadeDeJoinville.vendLar = 350000;
		unidadeDeJoinville.precLar = 3.39;

		Mercado unidadeDeFlorianopolis = new Mercado();
		
		unidadeDeFlorianopolis.nMercado = "unidadeDeFlorianopolis";
		unidadeDeFlorianopolis.vedMac = 500000;
		unidadeDeFlorianopolis.precMac = 5.89;
		unidadeDeFlorianopolis.vendLar = 500000;
		unidadeDeFlorianopolis.precLar = 6.59;
	}

}
