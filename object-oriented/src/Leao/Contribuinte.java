package Leao;

public class Contribuinte {
	
	private String nome;
	private String cpf;
	private String uf;
	private double rendAnual;

	public Contribuinte(String nome, String cpf, String uf, double rendAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setrendAnual(rendAnual);
	}
		
	private double calcularAliquota() {
			if (rendAnual <= 4000) {
				return 0;
			} else if (rendAnual <= 9000) {
				return 0.058;
			} else if (rendAnual <= 25000) {
				return 0.15;
			} else if (rendAnual <= 35000) {
				return 0.27;
			}
			return 0.3;
		}


	public double calcularImposto() {
		return calcularAliquota() * rendAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Erro, nome inválido");
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			System.out.println("Erro, cpf inválido");
		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.length() != 2) {
			System.out.println("Erro, uf inválido");
		} else {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendAnual;
	}


	public void setrendAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, renda anual inválida");
		} else {
			this.rendAnual = rendaAnual;
		}
	}

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", cpf=" + cpf + ", uf=" + uf + ", rendaAnual=" + rendAnual + "]";
	}
	
}