package br.edu.fa7.sd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class IO {
	
	public static String lerTeclado() throws IOException{
		
		System.out.println("Digite aqui: ");
		
		InputStream in = System.in;
		
		InputStreamReader is = new InputStreamReader(in);
	
		BufferedReader br = new BufferedReader(is);
		
		String line = br.readLine();
		
		br.close();
		
		return line;
		
	}
	
	public static void escreverNoArquivo() throws IOException{
		
		
		String conteudo = IO.lerTeclado();
		
		OutputStream outputStream = new FileOutputStream("Exemplo.txt");
		
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write(conteudo);
		
		bufferedWriter.newLine();
		
		bufferedWriter.flush();
		
		bufferedWriter.close();
		
		System.out.println("Feito!");
		
	}
	
	public static String lerArquivo() throws IOException{
		
		FileInputStream inputStream = new FileInputStream("Exemplo.txt");
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
		
		String line = "";
		
		StringBuilder sb = new StringBuilder();
		
		while ((line = bufferedReader.readLine()) != null) {
			sb.append(line).append("\n");
		}
		
		bufferedReader.close();
		return sb.toString();
	}
	
	public static void lerTecladoComScanner(){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite aqui: ");
		
		int i = 0;
		while (in.hasNext()) {
			i++;
			System.out.println("Linha: "+ i +" - " + in.next() );
		}
		
		in.close();
	}
	
public static void escreverArquivoComPrintStream() throws FileNotFoundException{
		
	FileOutputStream file = new FileOutputStream("Exemplo2.txt");
	
	PrintStream printStream = new PrintStream(file);
	
	String conteudo = "Sistemas Distribuidos";
	
	printStream.println(conteudo);
	
	printStream.close();
	
}

public static void lerArquivoComScanner() throws FileNotFoundException{
	
	Scanner in = new Scanner(new FileInputStream("Exemplo2.txt"));
	
	StringBuilder sb = new StringBuilder();
	while (in.hasNext()) {
		sb.append(in.next()).append(" ");
	}
	
	in.close();
	
	System.out.println(sb.toString());

}
	
	
	
public static void main(String[] args) throws IOException {
	 IO.lerArquivoComScanner();
}
}
