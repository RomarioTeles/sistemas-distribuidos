package br.edu.fa7.sd.socket.cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TratarConexoClienteCompleto implements Runnable {
	
	Socket servidor;
	
	public TratarConexoClienteCompleto(Socket servidor) {
		super();
		this.servidor = servidor;
	}

	@Override
	public void run() {
		try{
			Scanner s = new Scanner(servidor.getInputStream());
			
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
