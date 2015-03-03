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
public interface DiscountStrategy {
  
    double getDiscountAmt(double price);

    double getDiscountRate();

    double getDiscountedTotal(double price);

    double getPrice();

    void setDiscountRate(double discountRate);

    void setPrice(double price);
    
}
