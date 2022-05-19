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

    Database() {
        manager = new DBManager();
        conn = manager.getConnection();
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
