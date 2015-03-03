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
public class Customer {
    
    private int custId;
    private String 
            firstName,
            lastName;

    public Customer(int id, String firstName, String lastName) {
        this.custId = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(int custId, final String fullName) {
        this.custId = custId;
        setName(fullName);
    }
    
    public int getCustId() {
        return custId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public void setName(String FullName) {
        String[] name   = FullName.split(" ");
        this.firstName  = name[0];
        this.lastName   = name[1];
    }
    

    
}
