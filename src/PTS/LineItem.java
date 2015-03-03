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
public class LineItem {

    private Product product;

    public LineItem(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
    
    
}
