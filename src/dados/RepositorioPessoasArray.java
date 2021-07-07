package dados;

import java.util.Arrays;

import salaodebeleza.Pessoa;
import salaodebeleza.RepositorioPessoas;

public class RepositorioPessoasArray implements RepositorioPessoas {
	
	private Pessoa[] pessoa;
	private int indice;
	
	public RepositorioPessoasArray(int tamanho) {
		indice = 0;
		pessoa = new Pessoa[tamanho];
	}
	
	public void inserir(Pessoa c) {
		pessoa[indice] = c;
		indice = indice + 1;
	}
	
	public Pessoa procurar(String cpf) {
		Pessoa procurada = null;
		for(int i=0; i < indice; i++) {
			Pessoa aux = this.pessoa[i];
			if(aux.getCpf().equals(cpf))
				procurada = aux;			
		}
		return procurada;
	}
	
	public void remover(String cpf) {
		for(int i=0; i < indice; i++) {
			Pessoa aux = this.pessoa[i];
			if(aux.getCpf().equals(cpf)) {
				
				this.pessoa[i] = this.pessoa[indice -1];
				this.pessoa[indice -1] = null;
				
				indice = indice - 1;
			}
		}
	}

	@Override
	public String toString() {
		return "RepositorioPessoassArray [cliente=" + Arrays.toString(pessoa) + ", indice=" + indice + "]";
	}
}
	