package entities;

public class ImportedProduct extends Product {
	protected Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public ImportedProduct() {
		super();
	}
	
	public Double totalPrice() {
		
		return super.price+customsFee;
	
	}
	@Override
	public  String priceTag() {
		return "Product Imported $ " + String.format("%.2f", totalPrice());
	}
}
