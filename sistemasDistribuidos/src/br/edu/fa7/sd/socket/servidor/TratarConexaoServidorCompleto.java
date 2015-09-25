package br.edu.fa7.sd.socket.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import br.edu.fa7.sd.util.EscritaUtils;

public class TratarConexaoServidorCompleto implements Runnable {


	Socket cliente;
	
	PrintStream clientePrintStream;
	
	public TratarConexaoServidorCompleto(Socket cliente) throws IOException {
		super();
		this.cliente = cliente;
		clientePrintStream = new PrintStream(cliente.getOutputStream());
	}

	@Override
	public void run() {
		Scanner s;
		try {
			s = new Scanner(cliente.getInputStream());	
			
			StringBuilder sb = new StringBuilder();
			while(s.hasNextLine()){
				sb.append(s.nextLine());
			}
			
			String[] arr = sb.toString().split("#");
			
			if(arr[0].equals("cliente")){
				EscritaUtils es = new EscritaUtils("Registro_clientes.txt");
				es.escreverLinha(arr[1]);
				s.close();
			}else if(arr[0].equals("funcionario")){
				EscritaUtils es = new EscritaUtils("Registro_funcionarios.txt");
				es.escreverLinha(arr[1]);
				s.close();
			}else if(arr[0].equals("filme")){
				EscritaUtils es = new EscritaUtils("Registro_filmes.txt");
				es.escreverLinha(arr[1]);
				s.close();
			}else{
				System.out.println("Nada feito!");
			}		
			
			System.out.println("Feito!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
