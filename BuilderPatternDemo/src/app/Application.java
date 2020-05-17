package app;

public class Application {

	

	public static void main(String[] args) {
		
		
	
		DeliveryPack.Builder builder = new DeliveryPack.Builder("full");
		
		DeliveryPack deliveryPack =builder.vegetable("half").fruit("full").build();
		
		System.out.print(deliveryPack);
		

	}

}
