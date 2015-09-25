package br.edu.fa7.sd.socket.cliente;

import java.io.IOException;
import java.util.Scanner;

import br.edu.fa7.sd.entity.Cliente;
import br.edu.fa7.sd.entity.Filme;
import br.edu.fa7.sd.entity.Funcionario;
import br.edu.fa7.sd.util.LeituraUtils;

public class Cadastro {

	public static String start() throws IOException{
		
		System.out.println("Tela de Cadastros");
		Scanner s = new Scanner(System.in);
		String retorno = "";
		System.out.println("\tMenu: ");
		System.out.println("1 - Cadastrar Cliente");
		System.out.println("2 - Cadastrar Funcionário");
		System.out.println("3 - Cadastrar Filme");
		System.out.println("4 - Sair");
		System.out.print("Digite uma opção: ");
		int opcao = s.nextInt();
		
		switch (opcao) {
		case 1: retorno = cadastroCliente();
			break;
		case 2: retorno = cadastroFuncionario();
		break;
		case 3: retorno = cadastroFilme();
		break;
		case 4: System.out.println("Saiu!"); System.exit(0);
		break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		
		return retorno;
	}
	
	public static String cadastroCliente() throws IOException{
		
		System.out.println("Cadastro de clientes");
		Cliente cliente = new Cliente();
		
		System.out.println("Informe o Nome:");
		
		String nome = new LeituraUtils().lerLinha();
		
		cliente.setNome(nome);
		
		System.out.println("Informe o Código:");
		
		String codigo = new LeituraUtils().lerLinha();
		
		cliente.setId(codigo);
		
		
		return cliente.toString();
	}
	
	public static String cadastroFuncionario() throws IOException{
		
		System.out.println("Cadastro de funcionários");
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Informe o Nome:");
		
		String nome = new LeituraUtils().lerLinha();
		
		funcionario.setNome(nome);
		
		System.out.println("Informe o Código:");
		
		String codigo = new LeituraUtils().lerLinha();
		
		funcionario.setId(codigo);
		
		
		return funcionario.toString();
	}
	
	public static String cadastroFilme() throws IOException{
		
		System.out.println("Cadastro de Filme");
		Filme filme = new Filme();
		
		System.out.println("Informe o Nome:");
		
		String nome = new LeituraUtils().lerLinha();
		
		filme.setNome(nome);
		
		System.out.println("Informe o Código:");
		
		String codigo = new LeituraUtils().lerLinha();
		
		filme.setId(codigo);
		
		
		return filme.toString();
	}
	
}
