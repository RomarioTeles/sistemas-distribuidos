package br.edu.fa7.sd.entity;

import java.util.Date;

public class Aluguel {

	private Funcionario funcionario;
	
	private Date data;
	
	private Filme filme;
	
	private Double valor;
	
	private Cliente cliente;
	
	public Aluguel(){
		super();
	}

	public Aluguel(Funcionario funcionario, Cliente cliente, Date data, Filme filme) {
		super();
		this.funcionario = funcionario;
		this.data = data;
		this.filme = filme;
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		if(funcionario == null){
			funcionario = new Funcionario();
		}
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Filme getFilme() {
		if(filme == null){
			filme = new Filme();
		}
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		if(cliente == null){
			cliente = new Cliente();
		}
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Aluguel [funcionario=" + funcionario + ", data=" + data
				+ ", filme=" + filme + "]";
	}
	
	
	
	
}
