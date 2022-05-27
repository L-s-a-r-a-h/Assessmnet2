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
        EventView evView = new EventView();
        EventModel evModel = new EventModel();
       Controller control = new Controller(evView,evModel);
    }
    
}
