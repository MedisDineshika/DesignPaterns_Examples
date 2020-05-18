package app;

public class Interest extends Handler{

	@Override
	public double calculateInterest(CreditCard creditCard) {
		return successor.calculateInterest(creditCard);
	}

}
