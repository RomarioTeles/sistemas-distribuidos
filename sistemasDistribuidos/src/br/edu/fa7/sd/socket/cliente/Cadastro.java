package br.edu.fa7.sd.socket.cliente;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import br.edu.fa7.sd.entity.Aluguel;
import br.edu.fa7.sd.entity.Cliente;
import br.edu.fa7.sd.entity.Filme;
import br.edu.fa7.sd.entity.Funcionario;
import br.edu.fa7.sd.util.LeituraUtils;

public class Cadastro {

	public static String start() throws IOException{
		
		Aluguel aluguel = new Aluguel();
		
		Set<Aluguel> aluguels = new HashSet<Aluguel>();
		
		Filme filme1 = new Filme(1, "A hora do rush", "Ação", true, true, "14");
		
		Filme filme2 = new Filme(2, "Harry Potter 1", "Aventura", true, true, "12");
		
		Filme filme3 = new Filme(3, "Harry Potter 2", "Aventura", true, true, "14");
		
		Filme filme4 = new Filme(4, "Os vingadores 1", "Ação", true, true, "12");
		
		Filme filme5 = new Filme(5, "Os vingadores 2", "Ação", true, true, "14");
		
		Funcionario funcionario = new Funcionario(1, "Romario", "Caixa");
		
		Funcionario funcionario2 = new Funcionario(2, "Joao", "Caixa");
		
		Cliente cliente = new Cliente(1, "André Bessa");
		
		Cliente cliente1 = new Cliente(2, "Maria Chilindrina");
		
		Map<String, Funcionario> funcionarios = new HashMap<String, Funcionario>();
		
		Map<String, Cliente> clientes = new HashMap<String, Cliente>();
		
		Map<String, Filme> filmes = new HashMap<String, Filme>();
		
		filmes.put(filme1.getId().toString(), filme1);
		
		filmes.put(filme2.getId().toString(), filme2);
		
		filmes.put(filme3.getId().toString(), filme4);
		
		filmes.put(filme5.getId().toString(), filme5);
		
		clientes.put(cliente.getId().toString(), cliente);
		
		clientes.put(cliente1.getId().toString(), cliente1);

		funcionarios.put(funcionario.getId().toString(), funcionario);
		
		funcionarios.put(funcionario2.getId().toString(), funcionario2);
		
		String opcaoFuncionario;
		String opcaoCliente;
		String opcaoFilme;
		
			System.out.println("Aluguel de Filme");
			System.out.println("Selecione um funcionário");
			
			for (Map.Entry<String, Funcionario> entry : funcionarios.entrySet()) {
				System.out.println(entry.getValue().getId() +" - "+entry.getValue().getNome());
			}
			
			LeituraUtils l1 = new LeituraUtils();
			
			opcaoFuncionario = l1.lerLinha();
			
			aluguel.setFuncionario(funcionarios.get(opcaoFuncionario));		
			
			System.out.println("Selecione um Cliente");
			
			for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
				System.out.println(entry.getValue().getId() +" - "+entry.getValue().getNome());
			}
			
			LeituraUtils l2 = new LeituraUtils();
			
			opcaoCliente = l2.lerLinha();
			
			aluguel.setCliente(clientes.get(opcaoCliente));
			
			System.out.println("Informe o filme");
			
			for (Map.Entry<String, Filme> entry : filmes.entrySet()) {
				System.out.println(entry.getValue().getId() +" - "+entry.getValue().getNome());
			}
			
			LeituraUtils l3 = new LeituraUtils();
			
			opcaoFilme = l3.lerLinha();
			
			aluguel.setFilme(filmes.get(opcaoFilme));
			
			aluguels.add(aluguel);	
			
			aluguel.getCliente().setAlugueis(aluguels);
			
			LeituraUtils l5 = new LeituraUtils();
			
			//incrementa o id do aluguel, abre o arquivo e conta as linhas
			aluguel.setId(l5.contalinhas("Registro_Alugueis.txt")+1);
			
		
		return aluguel.toString();
	}
}
