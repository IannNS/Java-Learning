package util;

public class Calculator {
	
	//Para declarar que um valor de constante é inalterável, usa-se a palabra chave 'final'
	//Em Java, nome de constante é sempre inteiro em letra maiúscula (concaternação com '_')
	public static final double PI = 3.14159;
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return (4.0 * PI * Math.pow(radius, 3)) / 3;
	}
}
