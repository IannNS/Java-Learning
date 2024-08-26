package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangule;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Quantas formas deseja cadastrar: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n;i++) {
			
			System.out.println("Forma N°"+(i+1)+": ");
			System.out.print("Retângulo ou círculo (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(shape == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangule(color, width, height));
			}
			else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
			
		}
		
		System.out.println("\nÁrea da(s) forma(s): ");
		
		for(Shape s : shapes) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		sc.close();
		
	}

}
