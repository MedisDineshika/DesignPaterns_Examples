package app;

public class BenificialPackage extends Package{

	@Override
	protected void createPackage() {
		buyingways.add(new OnlineVisit());
		buyingways.add(new Shipping());
		
	}

}
