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
public class Main {
    public static void main(String[] args) {
        System.out.println("Please connect to DB server");

        EventView evView = new EventView();
        EventModel evModel = new EventModel();
       Controller control = new Controller(evView,evModel);
    }
    
}
