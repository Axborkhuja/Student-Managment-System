package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseLogin {
    public static Connection getDb(String TableName){

        try{

            Class.forName("com.mysql.jdbc.Driver");

            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/studentdata", "root", "");
            Statement state = connect.createStatement();
                    ResultSet resultSet = state.executeQuery("SELECT * FROM "+TableName);
            System.out.println(connect);
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
}
