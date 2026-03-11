
public class cadastrarVeiculo {
	
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		
		v1.marca = "Nissan";
		v1.modelo = "Skyline Gt-R R34 V-Spec II";
		v1.ano = 2002;
		v1.comprimento = 4.6;
		v1.velMax = 251;
		v1.cor = "Midnight purple";
		
		Veiculo v2 = new Veiculo();
		
		v2.marca = "McLaren";
		v2.modelo = "Senna";
		v2.ano = 2018;
		v2.comprimento = 4.74;
		v2.velMax = 335;
		v2.cor = "Roxo";
		
		if(v1.velMax > v2.velMax) {
			System.out.println("O " + v1.modelo + " é o mais rapido");
		}else {
			System.out.println("O " + v2.modelo + " é o mais rapido");
		}
	}
}
