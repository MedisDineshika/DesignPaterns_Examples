package momento.app;


public class Application {
	
public static void main(String[] args) {
		
	OrderHistory orderHistory = new OrderHistory();
	
	
	Order order = new Order();
	order.addProduct(new Product("trouser"));
	
	order.addProduct(new Product("top"));
	
	orderHistory.save(order);
	System.out.println(order);
	
	order.addProduct(new Product("shirt"));
	orderHistory.save(order);
	System.out.println(order);
	
	
	
	order.addProduct(new Product("Jacket"));
	orderHistory.save(order);
	System.out.println(order);
	
	orderHistory.revert(order);
	System.out.println(order);
	
	orderHistory.revert(order);
	System.out.println(order);
	
	orderHistory.revert(order);
	System.out.println(order);
	
	orderHistory.revert(order);
	System.out.println(order);
	
	
	}

}
