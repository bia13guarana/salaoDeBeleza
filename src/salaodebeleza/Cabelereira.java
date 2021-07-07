package salaodebeleza;

public class Cabelereira extends Pessoa {
	
	private double salario;
	
	public Cabelereira() {
		this.salario = 0;
	}
	
	public Cabelereira(String nome, String cpf, int idade, double salario) {
		super(nome, cpf, idade);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cabelereira [salario=" + salario + "]" + super.toString();
	}
	
}
