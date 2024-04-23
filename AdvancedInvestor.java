package observerPattern;

public class AdvancedInvestor implements Investor {
	String name;
	Strategy currentStrategy;
	double lastPrice=0;
	int dropCount=0;
	public AdvancedInvestor(String name)
	{
		this.name = name;
		this.currentStrategy = Strategy.HoldPositions;
	}
	@Override
    public void update(String stockSymbol, double priceChange) {
		System.out.print(getName() +" was notified by the price change in " + stockSymbol + ": $" + priceChange);
		if(priceChange<lastPrice)
		{
			dropCount++;
		}
		if(dropCount>=3) 
		{
			dropCount =0;
			currentStrategy = Strategy.HedgingStrategies;
			System.out.println(" and decide to change their strategy to"+ addaptStrategy());
		}
		else {
			System.out.println(" and decide to do nothing");
		}
		lastPrice =priceChange;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public Strategy addaptStrategy() {
		return currentStrategy;
	}
}
