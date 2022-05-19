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
public class Child extends Customer{
    
        double price;
    double discount = 0.5d;
    
    
        public Child(double price)
    {
        super("Child");
        this.price=price;

    }
        @Override
          public void printInfo() {
      
        System.out.println("Child has 50% discount");
     
    }
   @Override
    public double calculateCost(){
      this.cost = price*discount;
       return this.cost;
    }

 
    
}
