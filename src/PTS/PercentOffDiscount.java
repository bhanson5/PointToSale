
package PTS;

/**
 *
 * @author bhanson5
 */
public class PercentOffDiscount implements DiscountStrategy{
    
    private double discountRate;
    private double price;

    public PercentOffDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
        
    @Override
    public double getDiscountAmt(double price) {
        return price * discountRate;
    }
    
    @Override
    public double getDiscountedTotal(double price) {
        return price - getDiscountAmt(price);
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
