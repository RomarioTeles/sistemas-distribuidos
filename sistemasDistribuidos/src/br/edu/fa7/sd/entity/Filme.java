package br.edu.fa7.sd.entity;

import java.io.Serializable;

public class Filme implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3281118217436992891L;

	private String id;
	
	private String nome;
	
	public Filme(){
		super();
	}
	
	public Filme(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String codigo) {
		this.id = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "filme#Filme [id=" + id + ", nome=" + nome + "]";
	}
}
