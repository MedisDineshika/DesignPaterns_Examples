package app;

public class Application {

	public static void main(String[] args) {
		
		Printer printer = Printer.getPrinter();
		
		System.out.print(printer);
		
Printer printer2 = Printer.getPrinter();
		
		System.out.print(printer2);

	}

}
