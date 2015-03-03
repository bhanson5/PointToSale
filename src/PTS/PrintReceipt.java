
package PTS;



/**
 * Learned some great ways to format in java here
 * http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 */
public final class PrintReceipt implements Receipt {
    
    private final Customer        customer;
    private final LineItems       items;
    private final FormatedOutput  output = new FormatedOutput();
    private final String          thank  = "Thank you for shopping at Kohls \n";   
    private int   subTotal,
                  GrandTotal,
                  saveTotal;
                                  

    public PrintReceipt(Customer c, LineItems items) {
        this.customer = c;
        this.items = items;
        
        printThank(thank);
        printDate(); 
        printHeader();
        printBody();
        printFooter();
      
        
    }

 
    @Override
    public void printDate() {
        output.printFormatedDate();
        
    }

    @Override
    public void printThank(String msg) {
        System.out.println(customer.getFullName() + " " + msg);
    }
    
    public void printHeader() {
        System.out.println( output.getFormatedText("Description") +
                            output.getFormatedText("Original Price") +
                            output.getFormatedText("Discount") +
                            output.getFormatedText("Saved") +
                            output.getFormatedText("Price"));
        for (int i = 0; i<=102; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    
    public void printBody() {
        for (LineItem i : items.getItems()) {
            if (i != null) {
                
                String  description = i.getProduct().getName();
                double  originalPrice = i.getProduct().getPrice(),
                        discount = i.getProduct().getDiscount().getDiscountRate(),
                        saved = i.getProduct().getDiscount().getDiscountAmt(originalPrice),
                        price = i.getProduct().getDiscount().getDiscountedTotal(originalPrice);
                
                subTotal    += originalPrice;
                GrandTotal  += price;
                saveTotal   += saved;
                
                    System.out.println( 
                            output.getFormatedText(description) +
                            output.getFormatedText(FormatType.CURRENCY,   originalPrice) +
                            output.getFormatedText(FormatType.PERCENTAGE, discount) +
                            output.getFormatedText(FormatType.CURRENCY,   saved ) +
                            output.getFormatedText(FormatType.CURRENCY,   price));
            }            
        }
    }
    
    
    public void printFooter() {
        System.out.println("Sub Total   : " + output.getFormatedAmount(subTotal));
        System.out.println("Saved Total : " + output.getFormatedAmount(saveTotal));
        System.out.println("Grand Total : " + output.getFormatedAmount(GrandTotal));
    }
    
}
