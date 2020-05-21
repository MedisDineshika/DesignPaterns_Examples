package momento.app;

import java.util.Stack;

public class OrderHistory {
	
	Stack<Order.OrderMomento> history = new Stack<>();
	
	public void save (Order order){
		
		history.push(order.save());
			
	}

	
	public void revert(Order order){
		
	if(!history.isEmpty())
		order.revert(history.pop());
	else
		
		System.out.println("Can not perform UNDO");
		
	}
}
