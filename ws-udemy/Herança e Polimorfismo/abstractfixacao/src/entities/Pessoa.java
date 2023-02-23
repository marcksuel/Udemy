package entities;

import java.text.Format;

public abstract class Pessoa {
	protected String name;
	protected Double anualIncome;
	
	public Pessoa(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public Pessoa() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Double tax() {
		return 0.0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+": $"+ String.format("%.2f",tax()));
		return sb.toString();
	}
	
	
}
