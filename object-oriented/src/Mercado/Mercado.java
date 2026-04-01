package Mercado;

public class Mercado {
	String nMercado;
	int vedMac;
	double precMac;
	int vendLar;
	double precLar;
	
	public double obterReceitaMacas() {
        return vedMac * precMac;
    }

    public double obterReceitaLaranjas() {
        return vendLar * precLar;
    }

    public double obterReceitaTotal() {
        return obterReceitaLaranjas() + obterReceitaMacas();
    }
}
