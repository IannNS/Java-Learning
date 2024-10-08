package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o caminho de uma pasta: ");
		String strPath = sc.nextLine();
		
		// 'path' pois uma variável do tipo File pode ser tanto arquivos quanto pastas
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com sucesso: " +sucess);
		sc.close();

	}

}
