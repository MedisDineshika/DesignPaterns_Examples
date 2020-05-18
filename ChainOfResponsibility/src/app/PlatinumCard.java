package app;

public class PlatinumCard extends Handler{

	@Override
	public double calculateInterest(CreditCard creditCard) {
		creditCard.setInterest(creditCard.getPurchase()+creditCard.getPurchase()*0.027);
		
		if(creditCard.getPurchase()> 20000 && creditCard.getPurchase()<= 40000){
			return creditCard.getInterest();
			
		}
		
		else{
			
			return successor.calculateInterest(creditCard);
		}
	}

}
