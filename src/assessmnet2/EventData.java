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
public class EventData {

    private String name;//event name
    private String date;
    private double price;

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public EventData(String name, String date, double price) {
        this.name = name.trim();
        this.date = date;
        this.price = formatPrice(price);
    }
    
    
    //format the price to only be 2dp  
    public double formatPrice(double price) {
        DecimalFormat df = new DecimalFormat("0.00");
        String priceStr = df.format(price);
//String.format("%.20f",price);

        return Double.parseDouble(priceStr);
    }
}
