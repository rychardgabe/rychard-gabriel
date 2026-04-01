package Mercado;

public class cadastroProd {

	public static void main(String[] args) {
		Mercado unidadeBlumenau = new Mercado();
		
		unidadeBlumenau.nMercado = "unidadeDeBlumenau";
		unidadeBlumenau.vedMac = 100000;
		unidadeBlumenau.precMac = 3.79;
		unidadeBlumenau.vendLar = 100000;
		unidadeBlumenau.precLar = 4.99;
		
		Mercado unidadeJoinville = new Mercado();
		
		unidadeJoinville.nMercado = "unidadeDeJoinville";
		unidadeJoinville.vedMac = 350000;
		unidadeJoinville.precMac = 2.89;
		unidadeJoinville.vendLar = 350000;
		unidadeJoinville.precLar = 3.39;

		Mercado unidadeFlorianopolis = new Mercado();
		
		unidadeFlorianopolis.nMercado = "unidadeDeFlorianopolis";
		unidadeFlorianopolis.vedMac = 500000;
		unidadeFlorianopolis.precMac = 5.89;
		unidadeFlorianopolis.vendLar = 500000;
		unidadeFlorianopolis.precLar = 6.59;
		
		
		Mercado listaMercados[] = { unidadeBlumenau, unidadeJoinville, unidadeFlorianopolis };
		double maiorReceitaMacas = 0;
		Mercado mercadoMaiorReceitaMacas = null;
		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaMacas() > maiorReceitaMacas) {
				maiorReceitaMacas = listaMercados[i].obterReceitaMacas();
				mercadoMaiorReceitaMacas = listaMercados[i];
			}
		}

		System.out.println(mercadoMaiorReceitaMacas.nMercado);

		double menorReceitaLaranjas = Double.MAX_VALUE;
		Mercado mercadoMenorReceitaLaranjas = null;

		for (int i = 0; i < listaMercados.length; i++) {
			if (listaMercados[i].obterReceitaLaranjas() < menorReceitaLaranjas) {
				menorReceitaLaranjas = listaMercados[i].obterReceitaLaranjas();
				mercadoMenorReceitaLaranjas = listaMercados[i];
			}
		}

		System.out.println(mercadoMenorReceitaLaranjas.nMercado);
	}
}
