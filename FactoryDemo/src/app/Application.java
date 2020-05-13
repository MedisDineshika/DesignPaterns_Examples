package app;

public class Application {

	public static void main(String[] args) {
		
		Package package1=PackageFactory.createPackage(PackageType.BASIC);
		
		System.out.println(package1);
		
		
		Package package2=PackageFactory.createPackage(PackageType.BENIFICIAL);
		
		System.out.println(package2);
		
	}

}
