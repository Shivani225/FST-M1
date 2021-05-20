package activities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Activity2 {
	
	@Test
	public void notEnoughFunds() {
		
		BankAccount AccBalance = new BankAccount(9);
		assertThrows(NotEnoughFundsException.class, () -> AccBalance.withdraw(10));
		
	}
	
	@Test
	public void enoughFunds() {
		
		BankAccount AccBalance = new BankAccount(100);
		assertDoesNotThrow(() -> AccBalance.withdraw(100));
		
		
		
		
	}

}
