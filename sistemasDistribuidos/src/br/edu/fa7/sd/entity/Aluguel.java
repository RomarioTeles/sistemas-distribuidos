package br.edu.fa7.sd.entity;

import java.util.Date;

public class Aluguel {

	private Funcionario funcionario;
	
	private Date data;
	
	private Filme filme;

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

	@Override
	public String toString() {
		return "Aluguel [funcionario=" + funcionario + ", data=" + data
				+ ", filme=" + filme.getId() + "]";
	}
	
	
	
	
}
