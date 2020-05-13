package app;

import java.util.ArrayList;
import java.util.List;

public abstract class Package {
	
	protected List<Buying> buyingways = new ArrayList<>();
	
	public Package(){
		
		createPackage();
	}

	protected abstract  void createPackage();
	
@Override 
	
	public String toString (){
		return "package {" + "buyingways=" +buyingways+"}" ;
		
		
		
	}

}
