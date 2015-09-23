package br.edu.fa7.sd.socket.servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public Servidor() throws IOException{
		//cria o servidor
		ServerSocket serverSocket = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		//Espera um cliente se conectar e imprime o seu IP
		Socket cliente = serverSocket.accept();
		System.out.println("Nova conex�o com o cliente: " + cliente.getInetAddress().getHostAddress());
		
		Scanner s = new Scanner(cliente.getInputStream());
		
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
		}
		
	}

}
