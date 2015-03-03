
package PTS;

/**
 *
 * @author bhanson5
 */
public class ArrayDatabase implements DataManagement{

    
   private final Customer[] customers = {
        new Customer(100, "Billy", "bob")
    };
  private final Product[] products = {
        new Product(101, "MLB Brewer's Hat ", 19.95, null                        , ProductCategory.HATS  ),
        new Product(102, "Men's Dress Shirt", 35.50, new PercentOffDiscount(0.20), ProductCategory.SHIRTS),
        new Product(103, "Women's Socks"    , 9.50 , new PercentOffDiscount(0.50), ProductCategory.SOCKS )
    };
  @Override
    public final Customer findCustomer(final int custId) {
        // validation is needed for method parameter
             
        Customer customer = null;
        for(Customer c : customers) {
            if(custId == c.getCustId()) {
                customer = c;
                break;
            }
        }
        return customer;
    }
    
   @Override
        public final Product findProduct(final int productId) {
        // validation is needed for method parameter
             
        Product product = null;
        for(Product p : products) {
            if(productId == p.getProdId()) {
                product = p;
                break;
            }
        }
        return product;
    }

  

    
    
}
