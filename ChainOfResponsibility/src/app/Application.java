package app;

public class Application {
	
	
	public static void main(String[] args) {
	
		ClassicCard classic = new  ClassicCard ();
		GoldCard gold = new GoldCard ();
		PlatinumCard platimum = new PlatinumCard();
		Interest interest = new Interest();
		
		interest.setSuccessor(classic);
		classic.setSuccessor(gold);
		gold.setSuccessor(platimum);
		
		CreditCard creditCard = new CreditCard(1, 9000);
		System.out.println(interest.calculateInterest(creditCard));
		
		CreditCard creditCard2 = new CreditCard(1, 15000);
		System.out.println(interest.calculateInterest(creditCard2));
		
		
		CreditCard creditCard3 = new CreditCard(1,35000);
		System.out.println(interest.calculateInterest(creditCard3));
		
		
	}

}
