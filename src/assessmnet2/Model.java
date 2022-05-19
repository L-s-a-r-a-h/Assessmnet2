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
public class Model {
    
  //  public DBManager dbManager;
    public EventData Edata;
    public CustomerData Cdata;
    public Database db;
    
    
    public Model(){
       // this.dbManager = new DBManager();
       this.db= new Database();
 
       
    }
}
