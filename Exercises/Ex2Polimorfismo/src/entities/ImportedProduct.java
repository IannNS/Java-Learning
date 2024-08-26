package entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customFree) {
		super(name, price);
		this.customFee = customFree;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFree) {
		this.customFee = customFree;
	}
	
	public Double totalPrice() {
		return getPrice() + getCustomFee();
	}

	@Override
	public String priceTag() {
		return getName() + " R$"+String.format("%.2f", totalPrice()) + " (Imposto: R$" +String.format("%.2f", getCustomFee())+")";
	}
	
}
