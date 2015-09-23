package br.edu.fa7.sd.entity;

public class Funcionario extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2698694255203701203L;
	
	private String lotacao;
	
	public Funcionario(Integer id, String nome, String lotacao) {
		super(id, nome);
		this.lotacao = lotacao;
	}

	public Funcionario() {
		super();
	}

	public String getLotacao() {
		return lotacao;
	}

	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}

	@Override
	public String toString() {
		return "Funcionario [ id=" + getId() +", lotacao=" + lotacao
				+ ", nome=" + getNome() + "]";
	}


	
	
}
