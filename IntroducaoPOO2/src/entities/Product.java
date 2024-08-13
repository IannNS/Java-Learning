package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quantity) {
		//Para referenciar ao atributo da classe, usa-se a palavra 'this'
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name +", $"+ String.format("%.2f", price) +", "+ quantity +" unidades. Total: $"+ String.format("%.2f", totalValueInStock());
	}
}
