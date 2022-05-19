/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

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

    public double getCost() {
        //get the discounted cost of the customer type
        return calculateCost();
    }

    public abstract void printInfo();

    public abstract double calculateCost();
}
