package app;

public abstract class Product implements Cloneable{

	private long id;
	
	private String size;
	
	private long price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	
	@Override 
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
		
		
		
	}
	
	
	
}
