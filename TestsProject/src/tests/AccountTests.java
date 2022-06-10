package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	private Account account;
	
	@BeforeEach
	void setUp() throws Exception {
		account = new Account("Sergio", 100.0);
	}

	@Test
	public void depositShouldIncrementBalance() {
		
		double amount = 100.0;
		
		account.deposit(amount);
	
		Assertions.assertEquals(200.0, account.getBalance());
	}
	
	@Test
	public void withdrawShouldDecrementBalanceWhenAmountIsCorrect() {
		
		double amount = 20.0;
		
		account.withdraw(amount);
	
		Assertions.assertEquals(80.0, account.getBalance());
	}
	
	@Test
	public void withdrawShouldThrowExceptionWhenAmountGreaterThanBalance() {
		
		double amount = 500.0;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			account.withdraw(amount);
		});
	}

}
