
public class BATester {
public static void main(String[] args) {
	
	 BankAccount myAccount = new BankAccount(1000.0);
	 myAccount.deposit(100.0);
	 myAccount.withdraw(10.0);
	 myAccount.withdraw(30.0);
	 myAccount.withdraw(27.25);
	 myAccount.deposit(30.0);
	 myAccount.deposit(12.0);
	 
	 System.out.println("Bank account balance is expected 1074.75");
	 System.out.println("Bank account balance actaul: "+myAccount.getBalance());
	 
}
}
