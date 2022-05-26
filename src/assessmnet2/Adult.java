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
public class Adult extends Customer {

    double price;
    double discount = 1d;

    public Adult(double price) {
        super("Adult");
        this.price = price;

    }

    @Override
    public String getInfo() {

        return("Adult has no discount");

    }

    @Override
    public double calculateCost() {
        this.cost = price * discount;
        return this.cost;
    }

}
