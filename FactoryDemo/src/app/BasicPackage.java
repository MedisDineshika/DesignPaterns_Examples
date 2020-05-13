package app;

public class BasicPackage extends Package{

	@Override
	protected void createPackage() {
		buyingways.add(new PhysicalVisit());
		
	}

}
