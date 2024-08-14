package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converteToDollar(double price, double amount) {
		double dollar = (amount * price);
		return  dollar += dollar * IOF;
	}
}
