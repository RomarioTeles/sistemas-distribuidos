package br.edu.fa7.sd.entity;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5868464915113309104L;

	private Integer id;
	
	private String Nome;

	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		Nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
