package app;

public class PackageFactory {
	
	public static Package createPackage(PackageType packageType){
		
		switch (packageType){
		
		case BASIC :
		return new BasicPackage();
		
		case BENIFICIAL:
		return new BenificialPackage();
		
		
		default:
			return null ;
		
		}
		
		
		
		
	}

}
