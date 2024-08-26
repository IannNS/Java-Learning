package entities;

public abstract class Contributor {
	
	private String name;
	private Double anualProfit;
	private Double profitFee;
	
	public Contributor() {
	}

	public Contributor(String name, Double anualProfit) {
		this.name = name;
		this.anualProfit = anualProfit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualProfit() {
		return anualProfit;
	}

	public void setAnualProfit(Double anualProfit) {
		this.anualProfit = anualProfit;
	}
	
	public Double getProfitFee() {
		return profitFee;
	}
	
	public abstract Double profitFee();
}
