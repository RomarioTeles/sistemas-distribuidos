package br.edu.fa7.sd.entity;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5868464915113309104L;

	private String id;
	
	private String Nome;

	public Pessoa(String id, String nome) {
		super();
		this.id = id;
		Nome = nome;
	}

	public Pessoa() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String codigo) {
		this.id = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", Nome=" + Nome + "]";
	}
	
}
