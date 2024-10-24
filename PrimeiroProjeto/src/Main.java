import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		
		/* %f = ponto flutuante;
		 * %d = inteiro;
		 * %s = texto;
		 * %n = quebra de linha.
		 */
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
				
		//Muda o padrão de saída dos dados.
		Locale.setDefault(Locale.US); 
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO: "+ x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
