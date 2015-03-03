
package PTS;

/**
 *
 * @author bhanson5
 */
public class Startup {
    
    public static void main(String[] args) {
            
        CashRegister cr = new CashRegister();
        
        cr.startNewSale(100);
        cr.addItemToSale(101);
        cr.addItemToSale(102);
        cr.addItemToSale(103);
        cr.endSale();
        

    }
  
        

    
}
