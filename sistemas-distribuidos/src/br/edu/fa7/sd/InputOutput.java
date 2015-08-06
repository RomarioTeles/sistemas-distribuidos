package br.edu.fa7.sd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class InputOutput {

	public static String inputString(InputStream input) throws IOException{
		String line = "";
		try{
		InputStreamReader isr = new InputStreamReader(input);
			
		BufferedReader br = new BufferedReader(isr);	
		
		line = br.readLine();
		
		br.close();
		
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return line;
	}
	
	public static void output(String path, String conteudo) throws IOException{
		OutputStream os = new FileOutputStream(path);
		
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write(conteudo);
		
		bw.newLine();
		
		bw.flush();
		
		bw.close();
		
		System.out.println("Arquivo Criado!");
		
	}
	
}
