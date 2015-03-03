
package PTS;

/**
 *
 * @author bhanson5
 */
public class Product{
    
    private int productId;
    private String description;
    private double price;
    private DiscountStrategy discount;
    private ProductCategory category;
    
    
    public Product(int prodId, String name, double price, DiscountStrategy discount, ProductCategory category) {
        this.productId = prodId;
        this.description = name;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }
    
    public int getProdId() {
        return productId;
    }

    public String getName() {
        return description;
    }

    public void setName(String name) {
        this.description = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @param prodId the productId to set
     */
    private void setProdId(int prodId) {
        this.productId = prodId;
    }

    public DiscountStrategy getDiscount() {
        if (discount == null) {
            return new PercentOffDiscount(0.0);
        }
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }


    
    
    
}
