package application;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------");
		//Tem o mesmo efeito de chamar o vetor na posição 'i' no for acima
		//Descritiva:
		/* Para cada 'tipo' de 'objeto', faça...
		 * Para cada String obj de vect, faça...
		 */
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
