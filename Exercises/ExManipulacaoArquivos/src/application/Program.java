package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String path = "D:\\Learning\\JavaUdemy\\Learning_ws\\Exercises\\ExManipulacaoArquivos\\in\\in.csv";
		String target = "D:\\Learning\\JavaUdemy\\Learning_ws\\Exercises\\ExManipulacaoArquivos\\out\\summary.csv";
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			System.out.println("Arquivo de entrada: in.csv");
			String line = br.readLine();
			while (line != null) {
				
				//Separa a linha e adiciona os campos dela (separados por vírgula) em um array
				String[] field = line.split(",");
				String name = field[0];
				double price = Double.parseDouble(field[1]);
				int quantity = Integer.parseInt(field[2]);
				
				//Adiciona o item na lista de produtos
				products.add(new Product(name, price, quantity));
				System.out.println(line);
				
				//Vai para a próxima linha
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(target))){
				
				for(Product prod : products) {
					bw.write(prod.getName() + ", "+ String.format("%.2f", prod.getTotal()));
					bw.newLine();
				}
				
				System.out.println("Arquivo de saída: out.summary");
			}
			catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
