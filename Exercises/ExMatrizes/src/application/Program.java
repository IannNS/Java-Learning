package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá! Digite o número de linhas que a matriz terá: ");
		int n = sc.nextInt();
		
		System.out.println("Olá! Digite o número de colunas que a matriz terá: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		System.out.printf("Digite os dados da matriz [%d,%d]: %n", n, m);
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite a ocorrência de número que deseja verificar na matriz: ");
		int findNumber = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == findNumber) {
					System.out.printf("%nPosição da ocorrência: %d,%d%n", i, j);
					if (j > 0) {
						System.out.println("Número na esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Número acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Número na direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Número abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
	
}
