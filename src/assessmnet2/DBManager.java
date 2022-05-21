/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Sarah
 */
public class DBManager {
    
        Connection conn = null;
  
    private static final String USER_NAME = "pdc"; 
    private static final String PASSWORD = "pdc"; 
    private static final String URL = "jdbc:derby://localhost:1527/BookSys [pdc on PDC];create=true";  
    
  /*  public DBManager(){
        dbSetup();
    }*/
       public void dbSetup() {
           if(this.conn==null)
           {
                try {
            conn=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
 System.out.println("connected to "+ URL);
            
          /*  Statement statement = conn.createStatement();
            String tableName = "EventInfo";
            if (!checkTableExisting(tableName)) {
                System.out.println("Creating table...");
                statement.executeUpdate("CREATE TABLE " + tableName + "eventName VARCHAR(20), eventDate DATE(20),price FLOAT");

            }*/
        } catch (SQLException ex) {

                    System.out.println(ex.getMessage());
        }
           }
       

    }
    public Connection getConnection() {
        return this.conn;
    }
    
    
        public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
        
         public void updateDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
