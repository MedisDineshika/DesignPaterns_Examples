package app;

public class ClassicCard extends Handler{

	@Override
	public double calculateInterest(CreditCard creditCard) {
		creditCard.setInterest(creditCard.getPurchase()+creditCard.getPurchase()*0.02);
		
		if(creditCard.getPurchase()<= 10000){
			return creditCard.getInterest();
			
		}
		
		else{
			
			return successor.calculateInterest(creditCard);
	}
	}
}
