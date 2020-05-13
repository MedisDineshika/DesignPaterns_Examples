package app;

public class Printer {
	
	private static volatile  Printer printer ;
	
	
	private Printer(){
		
		if (printer != null){
            throw new RuntimeException("Use getPrinter() method to get the single instance of this class.");
        }
		
	}	
		public static Printer getPrinter() {
	        //Double check locking pattern
	        if (printer == null) { //Check for the first time
	          
	            synchronized (Printer.class) {   //Check for the second time.
	              //if there is no instance available... create new one
	              if (printer == null) 
	            	  printer = new Printer();
	            }
	        }

	        return printer;
	    }
	


		
	}

	
	
	
	
	
	
	
	
	
	

