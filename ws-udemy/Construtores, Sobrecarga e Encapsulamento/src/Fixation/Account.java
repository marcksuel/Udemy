package Fixation;

public class Account {
	private int number;
	private String user;
	private double deposit;
	
	public Account(int number, String user, double deposit) {
		this.number = number;
		this.user = user;
		deposit(deposit);
	}
	
	public Account(int number, String user) {
		this.number = number;
		this.user = user;
	}
	
	public void deposit(double value) {
		setDeposit(value);
	}
	
	public void withdraw(double value) {
		setDeposit(-(value+5)); 
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit += deposit;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account data\n"
				+ "Account " + number 
				+ ", Holder: " + user 
				+ ", Balance: $ " 
				+ String.format("%.2f", deposit)
				+"\n";
	}
	
	
	
}
