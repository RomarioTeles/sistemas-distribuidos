package br.edu.fa7.sd.entity;

import java.io.Serializable;

public class Filme implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3281118217436992891L;

	private Integer id;
	
	private String nome;
	
	private String genero;
	
	private Boolean legendado;
	
	private Boolean dublado;
	
	private String classificacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Boolean getLegendado() {
		return legendado;
	}

	public void setLegendado(Boolean legendado) {
		this.legendado = legendado;
	}

	public Boolean getDublado() {
		return dublado;
	}

	public void setDublado(Boolean dublado) {
		this.dublado = dublado;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return "Filme [id=" + id + ", nome=" + nome + ", genero=" + genero
				+ ", legendado=" + legendado + ", dublado=" + dublado
				+ ", classificacao=" + classificacao + "]";
	}
	
	
	
	
}
