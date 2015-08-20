package br.edu.fa7.sd.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Cliente extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = -741798168666949944L;

	private Set<Filme> filmes;
	
	private BigDecimal debito;
	
	private BigDecimal credito;
	
	
	public Cliente(Integer id, String nome, Set<Filme> filmes,
			BigDecimal debito, BigDecimal credito) {
		super(id, nome);
		this.filmes = filmes;
		this.debito = debito;
		this.credito = credito;
	}

	public Cliente(Integer id, String nome) {
		super(id, nome);
	}

	public Set<Filme> getFilmes() {
		if(filmes == null){
			filmes = new HashSet<Filme>();
		}
		return filmes;
	}

	public void setFilmes(Set<Filme> filmes) {
		this.filmes = filmes;
	}

	public BigDecimal getDebito() {
		if(debito == null){
			debito = BigDecimal.ZERO;
		}
		return debito;
	}

	public void setDebito(BigDecimal debito) {
		this.debito = debito;
	}

	public BigDecimal getCredito() {
		if(credito == null){
			credito = BigDecimal.ZERO;
		}
		return credito;
	}

	public void setCredito(BigDecimal credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente [filmes=" + filmes + ", debito=" + debito
				+ ", credito=" + credito + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + "]";
	}
	

}
