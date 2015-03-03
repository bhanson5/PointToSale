/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PTS;

import java.text.DecimalFormat;
import java.util.Calendar;


public class FormatedOutput {
    
    
      public String getFormatedText(FormatType type, Double text) {
          
          switch (type) {
              case CURRENCY:    return getFormatedText(getFormatedAmount(text)); 
              case PERCENTAGE:  return getFormatedText(getFormatedPercent(text));
          }
          
        return getFormatedText(String.valueOf(text));
    }
    
    public String getFormatedText(String text) {

        String formatedText = "";
        for (int i = 0; i<= 20; i++) {
            if (i >= text.length()) {
                formatedText += " ";
            } else {
               formatedText += text.charAt(i); 
            }
        }
        
        return formatedText + "\t";
    }
    
        
    public String getFormatedAmount(double amount) {
      return new DecimalFormat("$#,##0.00").format(amount);
   }

     public String getFormatedPercent(double percent) {
      return new DecimalFormat("## %").format(percent);
   }
    
     public void printFormatedDate() {
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY %tl:%tM %tp%n", c, c, c, c, c, c); // -->  March 2, 2015 3:18 am
        
    }
}
