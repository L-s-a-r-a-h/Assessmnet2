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
public class Senior extends Customer{
    double discount = 0.95d;
    double price;
    
            public Senior(double price)
    {
        super("Senior");
        this.price=price;

    }
    @Override
      public String getInfo() {
      
        return("Senior has 5% discount");
     
    }
                   
   @Override
    public double calculateCost(){
       this.cost = price*discount;
       return this.cost;
    }

 
   
}
