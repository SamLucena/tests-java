package entities;

public class Account {

	private String name;
	private Double balance;

	public Account() {}

	public Account(String name, Double initialBalance) {
		this.name = name;
		this.balance = 0.0;
		deposit(initialBalance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException("Valor para saque maior que saldo");
		}
		this.balance -= amount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

}
