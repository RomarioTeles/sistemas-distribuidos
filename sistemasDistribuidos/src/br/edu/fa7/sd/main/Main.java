package br.edu.fa7.sd.main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import br.edu.fa7.sd.entity.Aluguel;
import br.edu.fa7.sd.entity.Cliente;
import br.edu.fa7.sd.entity.Filme;
import br.edu.fa7.sd.entity.Funcionario;
import br.edu.fa7.sd.util.EscritaUtils;


public class Main {
	
	public static void main(String[] args) throws IOException {
	
		Filme filme = new Filme(1, "Fa7 80 Anos", "outros", false, false, "livre");
		
		Funcionario funcionario = new Funcionario(1, "Romario Teles", "Caixa");
		
		Cliente cliente = new Cliente(1, "Andre Bessa",15, 0);
		
		Aluguel aluguel = new Aluguel(funcionario, cliente, new Date(), filme);
		
		Set<Aluguel> aluguels = new HashSet<Aluguel>();
		
		aluguels.add(aluguel);
		
		cliente.setAlugueis(aluguels);
		
		FileOutputStream file = new FileOutputStream("cliente.txt", true);
		
		EscritaUtils.escreverArquivoComOutpuStream(file, cliente.toString());
		
	}
}
