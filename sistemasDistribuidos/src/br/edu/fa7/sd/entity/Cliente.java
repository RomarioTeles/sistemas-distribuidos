package br.edu.fa7.sd.entity;

import java.util.HashSet;
import java.util.Set;

public class Cliente extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = -741798168666949944L;

	private Set<Aluguel> alugueis;
	
	private Integer debito;
	
	private Integer credito;
	
	
	public Cliente(Integer id, String nome, Set<Aluguel> aluguel,
			Integer debito, Integer credito) {
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

	public Cliente(int id, String nome, int debito, int credito) {
		super(id, nome);
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

	public Integer getDebito() {
		if(debito == null){
			debito = 0;
		}
		return debito;
	}

	public void setDebito(Integer debito) {
		this.debito = debito;
	}

	public Integer getCredito() {
		if(credito == null){
			credito = 0;
		}
		return credito;
	}

	public void setCredito(Integer credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente [id= "+getId() +", nome= " +getNome() + ", debito= " + getDebito() + ", credito= " + getCredito() + "]";
	}

	

	
	
	
}
