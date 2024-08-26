package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
	}
	
	public OutsourcedEmployee(String name, Integer hoursWorked, Double valuePerHour, Double aditionalCharge) {
		super(name, hoursWorked, valuePerHour);
		this.additionalCharge = aditionalCharge;
	}

	public Double getAditionalCharge() {
		return additionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.additionalCharge = aditionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
}
