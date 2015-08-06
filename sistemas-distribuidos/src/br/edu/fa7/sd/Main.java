package br.edu.fa7.sd;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String path = InputOutput.inputString(System.in);

		System.out.println("a seguir digite o nome do arquivo:");
		
		String conteudo = InputOutput.inputString(System.in);
		
		System.out.println("a seguir digite o conteudo do arquivo:");
		
		InputOutput.output(path, conteudo);

	}

}
