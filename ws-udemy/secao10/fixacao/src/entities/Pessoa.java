package entities;

public class Pessoa {
	private String name;
	private int age;
	private double height;
	
	public Pessoa(String name, int age, double height) {
		setName(name);
		setAge(age);
		setHeight(height);
	}
	public Pessoa(String name, int age) {
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public String old() {
		return "Name: " + getName() 
				+ "\nAge: " + getAge() ;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() 
				+ "\nAge: " + getAge() 
				+ " \nHeight: " + String.format("%.2f", getHeight());
	}
	
	
	
}
