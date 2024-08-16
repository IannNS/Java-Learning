package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		//Matrizes são vetores bidimensionais (pode-se fazer maiores adicionando mais '[]'
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Olá! Digite o número de dimensões que a matriz terá: ");
		int n = sc.nextInt();
		
		//matriz[linha][coluna]
		int[][] mat = new int[n][n];
		
		//acessar length da coluna = matriz[posicao].length
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDiagonal principal: ");
		for(int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int countNegatives = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					countNegatives++;
				}
			}
		}
		System.out.printf("\nTotal de negativos = %d", countNegatives);
		sc.close();

	}

}
