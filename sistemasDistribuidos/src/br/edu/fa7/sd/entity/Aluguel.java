package br.edu.fa7.sd.entity;

import java.util.Date;

public class Aluguel {
	
	private Integer id;

	private Funcionario funcionario;
	
	private Date data;
	
	private Filme filme;
	
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
		if(data == null){
			data = new Date();
		}
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

	public Cliente getCliente() {
		if(cliente == null){
			cliente = new Cliente();
		}
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Aluguel [ id= "+ id + " funcionario=" + funcionario + ", data=" + getData()
				+ ", filme=" + filme + ", cliente=" + cliente + "]";
	}
	
	
	
	
}
