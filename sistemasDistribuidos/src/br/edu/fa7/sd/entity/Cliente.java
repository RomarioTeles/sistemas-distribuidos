package br.edu.fa7.sd.entity;

public class Cliente extends Pessoa{

	/**
	 * 
	 */
	private static final long serialVersionUID = -741798168666949944L;


	public Cliente(String id, String nome) {
		super(id, nome);
	}

	public Cliente() {
		super();
	}

	@Override
	public String toString() {
		return "cliente#Cliente [Id =" + getId() + ", Nome=" + getNome() + "]";
	}

	

	
	
	
}
