import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Separação por Enter
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		//nextLine só interpreta e recebe Strings ATENÇÃO: ELE LÊ A LINHA TODA!.
		//Para evitar consumo de linha, coloque um nextLine antes da variável que você deseja salvar.
		x = sc.nextInt();
		//limpar o buffer de leitura
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
