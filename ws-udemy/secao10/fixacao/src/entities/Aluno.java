package entities;

public class Aluno {

	private String name;
	private double first;
	private double second;
	
	
	public Aluno(String name, double first, double second) {

		setName(name);
		setFirst(first);
		setSecond(second);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}
	
	public boolean aprovation() {
		if((getFirst()+getSecond())/2 >= 6.0) {
			return true;
		}else {
			return false;
		}
	}
	
}
