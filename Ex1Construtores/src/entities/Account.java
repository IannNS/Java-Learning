package entities;

public class Account {
	private String name;
	private int number;
	private double balance;
	
	public Account() {
	}
	
	public Account(String name, int number, double balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double quantity) {
		return balance -= quantity + 5.00;
	}
	
	public double deposit(double quantity) {
		return balance += quantity;
	}
	
	public String accountData() {
		return String.format("%nDados da conta:%nNúmero da conta: %d, Dono da conta: %s, Saldo: R$%.2f%n" , getNumber(), getName(), getBalance());
	}
	
}
