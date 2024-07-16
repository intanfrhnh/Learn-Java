package Week10;


import java.util.Comparator;
import java.util.List;

public class CartComparator implements Comparator<ShoppingCart> {

    public double cartAverage(List<Double> prices){
        if(prices.size() == 0) return 0;

        double sum = 0;
        for(Double price:prices){
            sum+= price;
        }
        return sum/prices.size();
    }
    @Override
    public int compare(ShoppingCart cart1, ShoppingCart cart2) {
        if(cart1 != null && cart2 == null){
            return -1;
        }
        if(cart1 == null && cart2 == null){
            return 0;
        }
        if(cart1 == null && cart2 != null){
            return 1;
        }
        Double avgA = cartAverage(cart1.getItemPrices());
        Double avgB = cartAverage(cart2.getItemPrices());
        return avgA.compareTo(avgB);
    }
}
