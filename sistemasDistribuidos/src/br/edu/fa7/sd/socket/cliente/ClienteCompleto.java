package br.edu.fa7.sd.socket.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteCompleto {

	public ClienteCompleto() throws UnknownHostException, IOException{
		//Conecta ao Servidor
		Socket servidor = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		TratarConexoClienteCompleto tratarConexoClienteCompleto = new TratarConexoClienteCompleto(servidor);
		
		new Thread(tratarConexoClienteCompleto).start();
		
		System.out.println("Digite algo: ");
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(servidor.getOutputStream());
		
		while(teclado.hasNextLine()){
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
		servidor.close();
		
	}
}
