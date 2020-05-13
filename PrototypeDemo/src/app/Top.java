package app;

public class Top extends  Product{
	
	
	private int discount ;

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	 @Override
	    public String toString() {
	        return "Top{" +
	                "discount=" + discount +
	                
	                '}';
	    }

}
