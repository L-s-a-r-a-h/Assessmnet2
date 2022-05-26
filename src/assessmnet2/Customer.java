/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.text.DecimalFormat;

/**
 *
 * @author Sarah
 */
public abstract class Customer {

    String customerType;
    double cost = 0d;

    public Customer(String cType) {
        this.customerType = cType;
    }

    public String getCost() {
        DecimalFormat df = new DecimalFormat ("#.##");
        //get the discounted cost of the customer type
        return String.format("%.2f", calculateCost());//df.format(calculateCost());
    }

    public abstract String getInfo();

    public abstract double calculateCost();
}
