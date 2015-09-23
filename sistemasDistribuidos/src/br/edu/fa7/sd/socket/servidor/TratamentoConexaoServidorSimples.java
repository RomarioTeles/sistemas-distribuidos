package br.edu.fa7.sd.socket.servidor;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TratamentoConexaoServidorSimples implements Runnable{

	Socket cliente;
	
	public TratamentoConexaoServidorSimples(Socket cliente) {
		super();
		this.cliente = cliente;
	}



	@Override
	public void run() {
		Scanner s;
		try {
			s = new Scanner(cliente.getInputStream());	
			
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}
			
			s.close();
			cliente.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
