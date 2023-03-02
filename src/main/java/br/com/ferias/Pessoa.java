package br.com.ferias;

import java.io.Serializable;



public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int Id;
	private String nome;
	private transient boolean editando;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public boolean isEditando() {
		return editando;
	}

	public void setEditando(boolean editando) {
		this.editando = editando;
	}
	
}
