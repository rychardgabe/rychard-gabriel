package Aeronave;
public class Ex7 {

	public static void main(String[] args) {

		aeronave a1 = new aeronave("Boeing 747", 200, 700, 2000, 10);
		aeronave a2 = new aeronave("Airbus", 300, 600, 1000, 15);
		aeronave a3 = new aeronave("Cesna", 1, 200, 200, 1);
		aeronave a4 = new aeronave("Boeing 777", 390, 945, 1800, 20);
		
		aeronave listaAeronaves[] = { a1, a2, a3, a4 };

		int maiorPassageiros = 0;
		aeronave aeronaveMaisPassageiros = null;

		for (int i = 0; i < listaAeronaves.length; i++) {
			if (listaAeronaves[i].getPassageiros() > maiorPassageiros) {
				maiorPassageiros = listaAeronaves[i].getPassageiros();
				aeronaveMaisPassageiros = listaAeronaves[i];
			}
		}

		System.out.println(aeronaveMaisPassageiros);

	
		double maiorTempoAr = 0;
		aeronave aeronaveMaisTempoNoAr = null;
		for (int i = 0; i < listaAeronaves.length; i++) {
			if (listaAeronaves[i].calcularAutonomia() > maiorTempoAr) {
				maiorTempoAr = listaAeronaves[i].calcularAutonomia();
				aeronaveMaisTempoNoAr = listaAeronaves[i];
			}
		}

		System.out.println(aeronaveMaisTempoNoAr);

		double maisLonge = 0;
		aeronave aeronaveMaisLonge = null;

		for (int i = 0; i < listaAeronaves.length; i++) {
			if (listaAeronaves[i].calcularDistancia() > maisLonge) {
				maisLonge = listaAeronaves[i].calcularDistancia();
				aeronaveMaisLonge = listaAeronaves[i];
			}
		}
		System.out.println(aeronaveMaisLonge);

	}
}
