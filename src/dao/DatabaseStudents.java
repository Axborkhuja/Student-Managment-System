package dao;

import java.sql.*;

public class DatabaseStudents {
        public static final String mysqlUrl = "jdbc:mysql://localhost/studentData";

        public static ResultSet getStudentsDb() throws SQLException {
                Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
                Statement state = con.createStatement();
                ResultSet resultSet = state.executeQuery("SELECT * FROM Students WHERE 1");
                System.out.println(con);
                return resultSet;
        }
        public static PreparedStatement setStudentsDb() throws SQLException {
                Connection con = DriverManager.getConnection(mysqlUrl, "root", "");
                String query = "INSERT INTO Students(ID, First Name, Second Name, Last Name, Teaching Department, Address, Email, Phone Number, Teaching type) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);
                return pstmt;
        }
}
