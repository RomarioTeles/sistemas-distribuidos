package br.edu.fa7.sd.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;

public class LeituraUtils {

	InputStream inputStream = System.in;
	InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public LeituraUtils() throws IOException {

		// Ler cadeia de bytes de um teclado
		inputStream = System.in;

		// Converte para Char
		inputStreamReader = new InputStreamReader(inputStream);

		// Concatena o conjunto de Char em uma String
		bufferedReader = new BufferedReader(inputStreamReader);

	}

	public String lerLinha() throws IOException {

		// Lê uma linha
		String line = bufferedReader.readLine();
		//close();
		return line;
	}
	
		public void close() throws IOException {

		// Close
		bufferedReader.close();
	}
		
	public int contalinhas(String nomeArquivo){	
		try {
			File file = new File(nomeArquivo);
			FileInputStream input = new FileInputStream(file);
			return IOUtils.readLines(input).size();
		} catch (IOException e) {
			return 0;
		}
	}
}
