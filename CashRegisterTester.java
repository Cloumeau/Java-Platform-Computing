/**
 * 
 * @author c2lou
 *
 */
public class CashRegisterTester {

public static void main(String[] args) {
		
	CashRegister CashRegister5 = new CashRegister(0,0,0);
	  CashRegister5.addItem(20.0);
	  CashRegister5.getPurchaseTotal();
	  System.out.println("The Purchase total is"+CashRegister5.getPurchaseTotal());
	  CashRegister5.receivePayment(37.0);
	  CashRegister5.giveChange();
	  System.out.println("Change is "+CashRegister5.giveChange());
	  /**
	   * tester prints methods of purchase total and change
	   */
	  
	
	}

}
