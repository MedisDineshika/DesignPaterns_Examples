package app;

public class DeliveryPack {

	private final String grocery ;
	
	private final String vegetable ;
	
	private  final String fruit ;
	
	
	
	
	public DeliveryPack (Builder builder){
		
		this.grocery  = builder.grocery;
		this.vegetable= builder.vegetable;
		this.fruit = builder.fruit ;
		
		
	}
	
	static class Builder {
		
		private String grocery ;
		
		private String vegetable ;
		
		private String fruit ;
		
		public DeliveryPack build() {
			
			return new DeliveryPack(this);
		}
		
		
		public Builder (String grocery){
			this.grocery=grocery ;
		}
	
		

		public Builder vegetable(String vegetable){
			this.vegetable=vegetable ;
			
			return this;
				
		}
		
		public Builder fruit(String fruit){
			this.fruit=fruit ;
			
			return this;
				
		}

		
		
}
	
	
	@Override 
	
	public String toString(){
		
		return "DeliveryPack {" + 
		"grocery= '" +grocery+ '\''+
		",vegetable=" +vegetable  +
		",fruit="+fruit+'\''+
		
		
		
		
		
		'}' ;
		
		
		
		
	}
}