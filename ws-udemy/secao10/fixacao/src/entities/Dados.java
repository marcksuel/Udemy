package entities;

public class Dados {
	private double height;
	private char gender;
	
	public Dados(double height, char gender) {
		setHeight(height);
		setGender(gender);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}
