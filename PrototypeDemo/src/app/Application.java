package app;

public class Application {

	public static void main(String[] args) {
		Registry registry=new Registry();

		Product top=(Top)registry.getProduct(ProductType.TOP);
        System.out.println(top);


	}

}
