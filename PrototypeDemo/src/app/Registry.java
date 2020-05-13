package app;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<ProductType,Product> products=new HashMap<>();

    public Registry() {
        this.initialize();
    }

    private void initialize(){

       
	Top top = new Top ();

	top.setId(1002);
	top.setPrice(600);
	top.setSize("Excel");
	top.setDiscount(50);
	 
	 
	Skirt skirt = new Skirt();
	skirt.setId(1005);
	skirt.setPrice(680);
	skirt.setSize("Medium");
	 
	Trouser trouser = new Trouser();
	trouser.setId(1008);
	trouser.setPrice(2000);
	trouser.setSize("Medium");
	 
	products.put(ProductType.TOP,top);
	products.put(ProductType.SKIRT,skirt);
	products.put(ProductType.TROUSER,trouser);
}
    
    public Product getProduct(ProductType productType){

    	Product product=null;

        try {
        	product = (Product) products.get(productType).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return product;
    }
    
    
    
    
    
}