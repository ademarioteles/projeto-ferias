package br.com.managed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import br.com.ferias.Pessoa;

@ManagedBean(name = "PessoaMB")
@SessionScoped
public class PessoaMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Pessoa pessoa = new Pessoa();
	private int Id = 0;
	private List<Pessoa> pessoas = new ArrayList<>();
	private List<Pessoa> listarPessoas = new ArrayList<Pessoa>();

	public void adicionarNome() {
		
			pessoa.setId(Id++);
			pessoas.add(pessoa);
			pessoa = new Pessoa();
	
			
	}

	public void editar(Pessoa p) {

		p.setEditando(true);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public List<Pessoa> getListarPessoas() {
		return listarPessoas;
	}

	public void setListarPessoas(List<Pessoa> listarPessoas) {
		this.listarPessoas = listarPessoas;
	}

	public void deletar(int Id) {
		try {

			for (Pessoa p : pessoas) {

				if (p.getId() == (Id)) {
					
					pessoas.remove(p);
				}
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void salvar(int id, String nome) {
		try {
		for (Pessoa p : pessoas) {
			if (p.getId() == id) {
				
				p.setEditando(false);
			}

		}
	}catch(Exception e) {
		
		e.getMessage();
	}
	
	}

}
