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
    String name;//event name
    String date; 
    double price;
    
     EventData(String name, String date, double price) {
        this.name = name;
        this.date = date;
        this.price=price;
    }
}
