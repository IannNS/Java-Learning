package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Bo dia", "Ba tarde", "Ba noite"};
		
		String path = "D:\\Learning\\JavaUdemy\\Learning_ws\\Arquivos\\in.txt";
		
		// Para que ele escreva no fim (não recriar o arquivo), adicione o parêmetro 'true' no bloco de instância do FileWriter
		// Ficaria: ...(new FileWriter(path, true))) {...
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
