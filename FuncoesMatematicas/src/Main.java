
public class Main {

	public static void main(String[] args) {
		
		double delta;
		double x1;
		double x2;
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//Função para raiz quadrada.
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de "+ x + " = " + A);
		System.out.println("Raiz quadrada de "+ y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//Função para potenciação.
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//Função para módulo.
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = "+ A);
		System.out.println("Valor absoluto de " + z + " = "+ B);
		
		//Fórmula de bháskara
		delta = Math.pow(x, 2.0) - 4*y*z;
		
		x1 = (-x + Math.sqrt(delta)) / (2.0 * y);
		x2 = (-x - Math.sqrt(delta)) / (2.0 * y);
		
		System.out.println("Resultado da fórmula de bháskara: x1 = "+ x1 +" e x2 = " + x2);
	}

}
