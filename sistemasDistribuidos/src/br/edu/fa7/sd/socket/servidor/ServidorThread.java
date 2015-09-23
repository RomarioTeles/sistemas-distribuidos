package br.edu.fa7.sd.socket.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorThread {

	public ServidorThread() throws IOException {
		ServerSocket serverSocket = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		while (true) {

			Socket cliente = serverSocket.accept();
			System.out.println("Nova conex�o com o cliente: " + cliente.getInetAddress().getHostAddress());

			  // cria um objeto que vai tratar a conex�o
			  TratarConexaoServidorCompleto tratamento = new TratarConexaoServidorCompleto(cliente);

			  // cria a thread em cima deste objeto
			  Thread t = new Thread(tratamento);

			  // inicia a thread
			  t.start();

			}
	}
	
}
