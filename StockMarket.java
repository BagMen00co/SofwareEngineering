package observerPattern;

public class StockMarket {
    public static void main(String[] args) {
    	Stock appleStock = new ConcreteStock("APP",100);
    	Stock dellStock = new ConcreteStock("DEll",100);
    	// Register basic investor
    	Investor tomInvestor = new SimpleInvestor("Tom");
    	Investor bobInvestor = new SimpleInvestor("Bob");
    	appleStock.addObserver(tomInvestor);
    	appleStock.addObserver(bobInvestor);
    	dellStock.addObserver(tomInvestor);
    	// Register Advance investor
    	Investor steaveInvestor = new AdvancedInvestor("Steave");
    	Investor johnInvestor = new AdvancedInvestor("John");
    	appleStock.addObserver(steaveInvestor);
    	dellStock.addObserver(johnInvestor);

    	// Simulate a significant price change
    	appleStock.notifyInvestors(100);
    	appleStock.notifyInvestors(40.0);
    	appleStock.notifyInvestors(10.0);
    	appleStock.notifyInvestors(5.0);
    	dellStock.notifyInvestors(300.0);
    	dellStock.notifyInvestors(200.0);
    }
}