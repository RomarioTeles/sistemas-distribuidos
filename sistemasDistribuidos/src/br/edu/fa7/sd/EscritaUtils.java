package br.edu.fa7.sd;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class EscritaUtils {
	public static void escreverArquivoComOutpuStream(FileOutputStream file) throws IOException {

		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(file);

		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

		bufferedWriter.write(LeituraUtils.lerTecladoComInputStream());

		bufferedWriter.newLine();

		bufferedWriter.flush();

		bufferedWriter.close();

		System.out.println("Feito!");

	}
	
	public static void escreverArquivoComPrintStream() throws FileNotFoundException{
		
		FileOutputStream file = new FileOutputStream("Exemplo2.txt");
		
		PrintStream printStream = new PrintStream(file);
		
		String conteudo = "Sistemas Distribuidos";
		
		printStream.println(conteudo);
		
		printStream.close();
		
	}
}
