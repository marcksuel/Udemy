package entities;

public class Juridica extends Pessoa{
	protected Integer numberOfEmployee;

	public Juridica(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}
	
	public Juridica() {
		super();
	}

	@Override
	public Double tax() {
		Double tax;
		if(numberOfEmployee >10) {
			tax = getAnualIncome()*0.14;
		}else {
			tax = getAnualIncome()*0.16;
		}
		return tax;
	}
	
	
}
