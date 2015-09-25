package br.edu.fa7.sd.entity;

public class Funcionario extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2698694255203701203L;
	
	public Funcionario(String id, String nome) {
		super(id, nome);
	}

	public Funcionario() {
		super();
	}

	@Override
	public String toString() {
		return "funcionario#Funcionario [id="+getId() +", nome="+getNome()+ "]";
	}


	
	
}
