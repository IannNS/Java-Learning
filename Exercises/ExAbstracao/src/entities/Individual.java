package entities;

public class Individual extends Contributor{

	private Double healthCare;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualProfit, Double healthCare) {
		super(name, anualProfit);
		this.healthCare = healthCare;
	}

	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}

	@Override
	public Double profitFee() {
		double feeOver = 0.0;
		
		if(getAnualProfit() < 20000.00) {
			feeOver = 0.15;
		}
		else if (getAnualProfit() >= 20000.00) {
			feeOver = 0.25;
		}
		
		return (getAnualProfit() * feeOver) - (healthCare * 0.5);
	}
	
}
