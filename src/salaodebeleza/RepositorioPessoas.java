package salaodebeleza;

public interface RepositorioPessoas {
	
	void inserir(Pessoa pessoa);
	
	Pessoa procurar(String cpf);
	
	void remover(String cpf);

}
