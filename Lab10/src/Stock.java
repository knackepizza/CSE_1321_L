/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 10
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
		return "\t" + "Symbol: " + Symbol;
	}
	
	void setClosingPrice(double value) {
		previousClosingPrice = value;
	}
	
	void setCurrentPrice(double value) {
		currentPrice = value;
	}
	
	String getChangePercent() {
		double changePercent = Math.round((((currentPrice - previousClosingPrice)) / currentPrice) * 100);
		return "\t" + "Change Percent: " + (changePercent + "%");
	}

	public String toString() {
		return ("\t" + getName() + " stock current price is " + currentPrice + "\n");
	}
	
	
	public static void main(String[] args) {
		Stock google = new Stock("GOOG", "Google");
		google.setClosingPrice(134.67);
		google.setCurrentPrice(131.98);
		
		System.out.println(google.getName() + " stock:");
		System.out.println(google.getSymbol());
		System.out.println("\t" + "Closing Price: " + google.previousClosingPrice);
		System.out.println("\t" + "Current Price: " + google.currentPrice);
		System.out.println(google.getChangePercent());
		System.out.println(google.toString());
		
		Stock microsoft = new Stock("MSF", "Microsoft");
		microsoft.setClosingPrice(156.52);
		microsoft.setCurrentPrice(161.22);
		
		System.out.println(microsoft.getName() + " stock:");
		System.out.println(microsoft.getSymbol());
		System.out.println("\t" + "Closing Price: " + microsoft.previousClosingPrice);
		System.out.println("\t" + "Current Price: " + microsoft.currentPrice);
		System.out.println(microsoft.getChangePercent());
		System.out.println(microsoft.toString());
	}
}
