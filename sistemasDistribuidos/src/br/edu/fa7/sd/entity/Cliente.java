package br.edu.fa7.sd.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Cliente extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = -741798168666949944L;

	private Set<Aluguel> alugueis;
	
	private BigDecimal debito;
	
	private BigDecimal credito;
	
	
	public Cliente(Integer id, String nome, Set<Aluguel> aluguel,
			BigDecimal debito, BigDecimal credito) {
		super(id, nome);
		this.alugueis = aluguel;
		this.debito = debito;
		this.credito = credito;
	}

	public Cliente(Integer id, String nome) {
		super(id, nome);
	}

	public Cliente() {
		super();
	}

	public Set<Aluguel> getAlugueis() {
		if(alugueis == null){
			alugueis = new HashSet<Aluguel>();
		}
		return alugueis;
	}

	public void setAlugueis(Set<Aluguel> alugueis) {
		this.alugueis = alugueis;
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
		return "Cliente [alugueis=" + alugueis + ", debito=" + debito
				+ ", credito=" + credito + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + "]";
	}

	
	
	
}
