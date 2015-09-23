package br.edu.fa7.sd.socket.cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	
		public Cliente() throws UnknownHostException, IOException{
			//Conecta ao Servidor
			Socket cliente = new Socket("127.0.0.1", 12345);
			PrintStream saida = new PrintStream(cliente.getOutputStream());
			System.out.println("O cliente se conectou ao servidor!");
			
			System.out.println("Digite algo: ");
			Scanner teclado = new Scanner(System.in);
			
			while(teclado.hasNextLine()){
				saida.println(teclado.nextLine());
			}
			
			saida.close();
			teclado.close();
			cliente.close();
			
		}
	}

	