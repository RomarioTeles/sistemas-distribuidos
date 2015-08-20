package br.edu.fa7.sd.entity;

import java.io.Serializable;

public class Estoque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4716506840999380251L;

	private Integer id;
	
	private Filme filme;
	
	private Integer quantidade;

	public Estoque(){
		super();
	}
	
	public Estoque(Integer id, Filme filme, Integer quantidade) {
		super();
		this.id = id;
		this.filme = filme;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Filme getFilme() {
		if(filme==null){
			filme = new Filme();
		}
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Estoque [filme=" + filme + "]";
	}
	
	
	
	
}
