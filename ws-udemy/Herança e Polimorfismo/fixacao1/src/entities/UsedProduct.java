package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	protected Date manufactureDate;

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public UsedProduct() {
		super();
		
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public  String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append("ManufactureDate: " + sdf.format(manufactureDate));
		sb.append(" $ " + String.format("%.2f",price));
		return sb.toString();
	}

}
