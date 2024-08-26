package entities;

public class Company extends Contributor{
	
	private Integer employeeNumber;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualProfit, Integer employeeNumber) {
		super(name, anualProfit);
		this.employeeNumber = employeeNumber;
	}
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public Double profitFee() {
double feeOver = 0.0;
		
		if(getEmployeeNumber() < 10) {
			feeOver = 0.16;
		}
		else if (getEmployeeNumber() >= 10) {
			feeOver = 0.14;
		}
		
		return (getAnualProfit() * feeOver);
	}

}
