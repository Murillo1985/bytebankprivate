public class Account {
	private double balance;
	int agency;
	int number;
	Client holder;
	
	public void deposits(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {
			this.balance -= value;
			return true;
		}	return false;
	}
	
	public boolean transfer(double value, Account destination) {
		if(this.balance >= value) {
			this.balance -= value;
			destination.deposits(value);
			return true;
		}	return false;
	}
	public double getBalance() {
		return this.balance;
	}
}