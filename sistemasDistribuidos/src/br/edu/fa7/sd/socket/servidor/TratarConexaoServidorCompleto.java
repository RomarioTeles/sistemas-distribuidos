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
			EscritaUtils es = new EscritaUtils("Registro_Alugueis.txt");
			es.escreverLinha(sb.toString());
			s.close();
			cliente.close();
			
			System.out.println("Feito!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
