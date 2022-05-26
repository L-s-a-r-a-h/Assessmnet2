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
public class Student extends Customer {

    double price;
    double discount = 0.9d;

    public Student(double price) {
        super("Student");
        this.price = price;

    }

    @Override
    public String getInfo() {

       return("Student has a 10% discount");

    }

    @Override
    public double calculateCost() {
        this.cost = price * discount;
        return this.cost;
    }

}
