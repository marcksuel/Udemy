package entities;

public class Fisica extends Pessoa{
	protected Double healthExpenditures;

	public Fisica(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Fisica() {
		super();
	}

	@Override
	public Double tax() {
		Double tax;
		if(getAnualIncome()<20000) {
			tax = (getAnualIncome()*0.15 )- healthExpenditures*.5;
		}else {
			tax = (getAnualIncome()*0.25 ) - healthExpenditures*.5;
		}
		return tax;
	}
	
	
}
