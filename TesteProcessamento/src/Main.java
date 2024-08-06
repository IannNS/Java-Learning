
public class Main {

	public static void main(String[] args) {
		/*Boa prática: Para visualização facilitada de que um 
		 * número é double, utilize a finalização .0.
		 * 
		 * Para Float, use o f.
		 * ex: 
		 * 
		 * b = 6f;
		 * 
		 * Para exibir um resultado formatado, utiliza-se 
		 * o tipo de resultado entre parênteses antes da
		 * função (Casting). Ex:
		 * 
		 * resultado = (double) y - x;
		 * 
		 * Usa-se Casting para evitar erros na compilação
		 * quando o sistema crê que você vá perder informação.
		 * Ex:
		 * 
		 * float a;
		 * int b;
		 * 
		 * a = 5.0;
		 * b = (int) a;
		 */
		
		//Calculo área do trapézio.
		double b, B, h, area;
		
		//Formatação de resultado
		int x, y;
		double resultado;
		x = 2;
		y = 5;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		resultado = (double) y / x;
		area = (b + B) / 2.0 * h;

		System.out.println(resultado);	
		System.out.println(area);	
	}

}
