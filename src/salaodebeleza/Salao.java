package salaodebeleza;

public class Salao {
	
	private String nome;
	private int cep;
	
	public Salao() {
		this.nome = null;
		this.cep = 0;
	}

	public Salao(String nome, int cep) {
		this.nome = nome;
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Salao [nome=" + nome + ", cep=" + cep + "]";
	}
	
}