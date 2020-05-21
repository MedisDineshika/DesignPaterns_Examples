package momento.app;

import java.util.ArrayList;

public class Order {
	
	ArrayList<Product> products = new ArrayList<>();
	
	public void addProduct(Product product){
		products.add(product);
		
		
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<Product> getProducts() {
		return (ArrayList)products.clone();
	}

	public OrderMomento save(){
		return new OrderMomento(getProducts()) ;
			
	}

	public void revert(OrderMomento orderMomento){
		
		products=orderMomento.getProducts();
		
	}


	@Override
	public String toString() {
		return "Order [products=" + products + "]";
	}



	static class OrderMomento{
		
		ArrayList<Product> products;

		public OrderMomento(ArrayList<Product> products) {
			
			this.products = products;
		}

		private ArrayList<Product> getProducts() {
			return products;
		}
		
		
		
		
		
		
	}
	
	
}
