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
public class CashRegister {
    
    
    private Receipt receipt;
    private LineItems lineitems;
    private DataManagement data = new ArrayDatabase();
    private Customer customer; 
    
    public void startNewSale(final int custId) {     
        customer = data.findCustomer(custId);
        lineitems = new LineItems(customer);
    }
   
    public void addItemToSale(final int prodId) {
        LineItem item = new LineItem(data.findProduct(prodId));
        
        lineitems.addItem(item);
    }
    
    public void endSale() {
        printReceipt();
    }
    
    private void printReceipt() {
        receipt = new PrintReceipt(customer, lineitems);
    }
}
