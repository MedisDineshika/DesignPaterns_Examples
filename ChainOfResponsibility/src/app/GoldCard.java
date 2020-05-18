package app;

public class GoldCard extends Handler {

	@Override
	public double calculateInterest(CreditCard creditCard) {
		creditCard.setInterest(creditCard.getPurchase()+creditCard.getPurchase()*0.024);
		
		if(creditCard.getPurchase()> 10000 && creditCard.getPurchase()<=20000 ){
			return creditCard.getInterest();
			
		}
		
		else{
			
			return successor.calculateInterest(creditCard);
		}
	}

}
