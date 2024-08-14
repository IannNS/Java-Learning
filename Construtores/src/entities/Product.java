package entities;

public class Product {
	
	String name;
	private double price;
	private int quantity;
	
	//Exemplo de Construrores, palavra 'this' e sobrecagar
	//Nota: a palavra 'this' pode ser utilizada para referenciar o objeto dentro do próprio escopo;
	//Pelo padrão NetBeans, construtores get e set são redigidos depois dos construtores da aplicação;
	//Você ainda pode utilizar o construtor padrão dos objetos da classe referenciando-o como o código abaixo;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//Para manter a integridade do objeto, por padrão, não se cria um set para variáveis de quantidade;
	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
