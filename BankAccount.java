/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 */
public class BankAccount {

	//instance variable - holds the state of the object
	private double balance;

	/**
	 * Constructs a bank account with a zero balance.
	 */
	//Constructor
	public BankAccount() {
		balance = 0;
	}

	/**
	 * Constructs a bank account with a given balance.
	 * @param initialBalance the initial balance
	 */
	//Constructor
	//We have 2 constructors
	//We must use one of these constructors to create a BankAccount object
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	//Getter method
	//We do not have a setter method
	//We do not want the balance, instance variable modified outside of the class
	/**
	 * Gets the current balance of the bank account.
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}		
	
	/**
	 * Deposits money into the bank account.
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * Withdraws money from the account
	 * @param amount
	 * @return true if balance is greater than amount, otherwise return false
	 */
	public boolean withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
			return true;
		} else return false;
	}
}