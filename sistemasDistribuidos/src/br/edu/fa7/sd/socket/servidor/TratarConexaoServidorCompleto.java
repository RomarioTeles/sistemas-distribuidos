package br.edu.fa7.sd.socket.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

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
			
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
				clientePrintStream.println("Mensagem Recebida");
			}
			
			s.close();
			cliente.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
