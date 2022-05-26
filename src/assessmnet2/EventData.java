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
public class EventData {
   private String name;//event name
  private  String date; 
  private  double price;

    public String getName() {
        return name;
    }



    public String getDate() {
        return date;
    }



    public double getPrice() {
        return price;
    }

    
     EventData(String name, String date, double price) {
        this.name = name.trim();
        this.date = date;
        this.price=price;
    }
}
