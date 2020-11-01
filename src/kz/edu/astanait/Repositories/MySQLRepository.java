package kz.edu.astanait.Repositories;

import kz.edu.astanait.Repositories.interfaces.IDBRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLRepository implements IDBRepository {
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connStr = "jdbc:mysql://localhost/uhack?serverTimezone=Europe/Moscow&useSSL=false";
            return DriverManager.getConnection(connStr, "Eldar", "Eldar56048");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}