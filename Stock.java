package observerPattern;

import java.util.ArrayList;
import java.util.List;
public interface Stock {
    public void addObserver(Investor investor);
    public void removeObserver(Investor investor) ;
    public void notifyInvestors(double priceChange);

}
