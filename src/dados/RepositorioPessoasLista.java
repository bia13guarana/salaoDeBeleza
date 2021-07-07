package dados;

import java.util.ArrayList;
import java.util.List;

import salaodebeleza.Pessoa;
import salaodebeleza.RepositorioPessoas;

public class RepositorioPessoasLista implements RepositorioPessoas {
		
		private List <Pessoa> lista;
		
		public RepositorioPessoasLista() {
			this.lista = new ArrayList<Pessoa>();
		}
		
		public void inserir(Pessoa a) {
			lista.add(a); 
		}
		
		public Pessoa procurar(String cpf) {
			Pessoa procurado = null;
			for (Pessoa func : lista) {
				if(func.getCpf().equals(cpf)) {
					procurado = func;
				}
			}

			return procurado;
		}
		
		public void remover(String cpf) {
			int posicao = -1;
			Pessoa procurado=null;
			for (Pessoa func : lista) {
				if(func.getCpf().equals(cpf)) {
					posicao = lista.indexOf(func);
					procurado = func;
					break;
				}
			}
				if (posicao != -1) {
					lista.remove(posicao);
					
					System.out.println( procurado.getNome() + ", cpf: " + procurado.getCpf() + ", removida.\n");
				} else {
					System.out.println("Pessoa não cadastrada.\n");
				}
			}
		
		public List<Pessoa> publicarLista(){
			return this.lista;
		}

}
