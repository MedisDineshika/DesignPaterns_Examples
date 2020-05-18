package app;

public class CreditCard {
	
	private int receiptNum ;
	
	private double purchase ;
	
	private double interest ;
	
	
	

	public CreditCard(int receiptNum, double purchase) {
		
		this.receiptNum = receiptNum;
		this.purchase = purchase;
	}



	public int getReceiptNum() {
		return receiptNum;
	}

	

	public double getPurchase() {
		return purchase;
	}

	
	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
	
	

}
