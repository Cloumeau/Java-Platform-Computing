/**
 * 
 * @author c2lou
 *
 */
public class CashRegister {

	private double change;
	private double payment;
	private double purchase;
	
	/**
	 * made change, payment and purchase all double in private class
	 * 
	 * 
	 */
	
	public CashRegister(double change,double payment,double purchase) {
		this.change=change;
		this.payment=payment;
		this.purchase=purchase;
	}
	/**
	 * constructor for class
	 * @return
	 */
	public double getPurchaseTotal() {
		return  purchase;
	}
	/**
	 * adds prices of all items
	 * @param price
	 */
	public void addItem(double price) {
		purchase= price+purchase;
	}
		/**
		 * gets intial price
		 */
	public void receivePayment(double price) {
		payment=price;
	}
	/**
	 * method for change sets change equal to payment minus purchase total
	 */
	public double  giveChange () {
		change = payment - getPurchaseTotal();
	    return change;
	    
		
}
 
	
	
}

	
	
	
	
	
	