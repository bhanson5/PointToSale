/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PTS;

/**
 *
 * @author bhanson5
 */
public class LineItems {
    private LineItem[] items = new LineItem[1];;
    private Customer   customer; 

    public LineItems(Customer customer) {
        this.customer = customer;
    }
    

    
    public void addItem(LineItem item) {
        if (items == null) { 
        items = new LineItem[1];
        }
        items[items.length - 1] = item;
        LineItem[]  
                    dest    = new LineItem[this.items.length + 1];
        final int   srcPos  = 0,
                    destPos = 0,
                    length  = items.length;
                
//               src        - the source array. 
//               srcPos     - starting position in the source array.
//               dest       - the destination array. 
//               destPos    - starting position in the destination data. 
//               length     - the number of array elements to be copied.
        
              System.arraycopy(this.items, srcPos, dest, destPos, length);
              items = dest;
              
              
              
              
              
        
          
            
        
    }

    public LineItem[] getItems() {
        return items;
    }

    
}
