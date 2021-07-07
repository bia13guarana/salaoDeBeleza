package salaodebeleza;

public class Cliente extends Pessoa {
	
	private Salao salao;
	
	public Cliente() {
		this.salao = null;
	}

	public Cliente(String nome, String cpf, int idade, Salao salao) {
		super(nome, cpf, idade);
		this.salao = salao;
	}

	public Salao getSalao() {
		return salao;
	}

	public void setSalao(Salao salao) {
		this.salao = salao;
	}

	@Override
	public String toString() {
		return "Cliente [salao=" + salao + "]" + super.toString();
	}
	
}
	
	