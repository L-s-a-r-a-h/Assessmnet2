/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmnet2;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sarah
 */
public class Database {

    private final DBManager manager;
    private final Connection conn;
    private Statement statement;
    
        public EventData Edata;
    public CustomerData Cdata;

    Database() {
        manager = new DBManager();
        manager.dbSetup();
        conn = manager.getConnection();
        initDB();
        
       // initDB();
    }

    public void initDB() {
        try {
            this.statement = conn.createStatement();
            this.checkTableExisting("BOOK");
            this.statement.executeUpdate("CREATE  TABLE EVENTS  (eventID  INT,   eventName   VARCHAR(50),   evetnDate   VARCHAR(20),   PRICE   FLOAT)");
            System.out.println("table created");
            this.statement.executeUpdate("INSERT INTO EVENTS VALUES (1, 'Slum Dog Millionaire', '11/12/2022', 19.90),\n"
                    + "(2, 'Run Mummy Run', '30/06/2022', 28.00),\n"
                    + "(3, 'The Land of Painted Caves', '30/06/2022', 15.40),\n"
                    + "(4, 'Cook with Jamie', '13/09/2022', 55.20),\n"
                    + "(5, 'Far Eastern Odyssey', '20/07/2022', 24.90)");
             
            
        } catch (SQLException ex) {
            System.out.println("db create initial table error");
        }
    }

    public ResultSet queryDB(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    public void createEventBookingsTable(String tableName) {
        if (checkTableExisting(tableName) == false) {
            try {
                this.statement.executeUpdate("CREATE TABLE " + tableName + " (cName VARCHAR(20), seatNo INT, cType VARCHAR(20))");
            } catch (SQLException ex) {
                System.out.println("error");
            }
        }

    }

    private boolean checkTableExisting(String tableName) {
        boolean flag = false; //table does not exist
        try {
            System.out.println("checking tables...");
            DatabaseMetaData dm = conn.getMetaData();
            ResultSet rs = dm.getTables(null, null, tableName, null);
            if (rs.next()) {
                flag = true;

            } else {
                flag = false;
            }
        } catch (SQLException ex) {
            System.out.println("table error");
        }
        return flag;
    }
}
