/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 1
*/

public class Stock {
	String Symbol;
	String Name;
	double previousClosingPrice, currentPrice;
	
	public Stock(String inputSymbol, String inputName) {
		Symbol = inputSymbol;
		Name = inputName;
	}
	
	String getName() {
		return Name;
	}
	
	String getSymbol() {
		return Symbol;
	}
	
	void setClosingPrice(double value) {
		previousClosingPrice = value;
	}
	
	void setCurrentPrice(double value) {
		currentPrice = value;
	}
	
	String getChangePercent() {
		double changePercent = Math.round((((currentPrice - previousClosingPrice)) / currentPrice) * 100);
		return ((int) changePercent + "%");
	}
	
	
	public static void main(String[] args) {
		Stock google = new Stock("GOOG", "Google");
		google.setClosingPrice(134.67);
		google.setCurrentPrice(131.98);
		
		System.out.println(google.getName() + " stock:");
		System.out.println("	" + "Symbol: " + google.getSymbol());
		System.out.println("	" + "Closing Price: " + google.previousClosingPrice);
		System.out.println("	" + "Current Price: " + google.currentPrice);
		System.out.println("	" + "Change Percent: " + google.getChangePercent());
		System.out.println("	" + google.getName() + " stock current price is " + google.currentPrice + "\n");
		
		Stock microsoft = new Stock("MSF", "Microsoft");
		microsoft.setClosingPrice(156.52);
		microsoft.setCurrentPrice(161.22);
		
		System.out.println(microsoft.getName() + " stock:");
		System.out.println("	" + "Symbol: " + microsoft.getSymbol());
		System.out.println("	" + "Closing Price: " + microsoft.previousClosingPrice);
		System.out.println("	" + "Current Price: " + microsoft.currentPrice);
		System.out.println("	" + "Change Percent: " + microsoft.getChangePercent());
		System.out.println("	" + microsoft.getName() + " stock current price is " + microsoft.currentPrice + "\n");
	}
}
