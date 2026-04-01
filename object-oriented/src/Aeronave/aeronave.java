package Aeronave;

public class aeronave {
	private String modelo;
	private int passageiros;
	private double velMax;
	private double capTanqComb;
	private double consumo;
	
	public aeronave(String modelo, int passageiros, double velMax, double capTanqComb, double consumo) {
		super();
		setModelo(modelo);
		setPassageiros(passageiros);
		setVelMax(velMax);
		setCapTanqComb(capTanqComb);
		setConsumo(consumo);
	}
	
	public double calcularAutonomia() {
		return capTanqComb / consumo;
	}
	public double calcularDistancia() {
		return velMax * calcularAutonomia();
	}
		


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			System.out.println("Erro, modelo inválido");
		} else {
			this.modelo = modelo;
		}
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			System.out.println("Erro, quantidade de passageiros não pode ser negativa");
		} else {
			this.passageiros = passageiros;
		}
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		if (velMax <= 0) {
			System.out.println("Erro, velocidade máxima inválida");
		} else {
			this.velMax = velMax;
		}
	}

	public double getCapTanqComb() {
		return capTanqComb;
	}

	public void setCapTanqComb(double capTanqComb) {
		if (capTanqComb <= 0) {
			System.out.println("Erro, capacidade de combustível inválida");
		} else {
			this.capTanqComb = capTanqComb;
		}
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		if (consumo <= 0) {
			System.out.println("Erro, queima inválida");
		} else {
			this.consumo = consumo;
		}

	}
	
	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + 
				   ", passageiros=" + passageiros + 
				   ", velMax=" + velMax +
				   ", capCombustivel=" + capTanqComb + 
				   ", queimaCombustivel=" + consumo + "]";
	}
}	

