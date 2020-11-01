package kz.edu.astanait.Repositories;

import kz.edu.astanait.Models.Appeal;
import kz.edu.astanait.Models.User;
import kz.edu.astanait.Repositories.interfaces.IUserRepository;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    MySQLRepository dbRepo = new MySQLRepository();
    public User getUserByUsernameAndPassword(String login, String password) {
        String sql = "Select * from user where login='"+login+"' and password='"+password+"'";
        return queryOne(sql);
    }

    public int add(User entity){
        try {
            String sql = "INSERT INTO user(name, surname, login, password) " +
                    "VALUES(?, ?, ?, ?)";
            PreparedStatement stmt = dbRepo.getConnection().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, entity.getName());
            stmt.setString(2, entity.getSurname());
            stmt.setString(3, entity.getLogin());
            stmt.setString(4, entity.getPassword());
            stmt.execute();
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public ArrayList<User> getAllUsers(){
        String sql = "select * from user";
        return query(sql);
    }
    public void update(User entity) {
        String sql = "UPDATE user SET login=?, password= ?  where user.id=?";
        try {
            PreparedStatement stmt = dbRepo.getConnection().prepareStatement(sql);
            stmt.setString(1, entity.getLogin());
            stmt.setString(2,entity.getPassword());
            stmt.setInt(3,entity.getId());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void remove(User entity) {
        try {
            String sql = "Delete from user WHERE user.id = ?";
            PreparedStatement stmt = dbRepo.getConnection().prepareStatement(sql);
            stmt.setInt(1,entity.getId());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<User> query(String sql){
        try {
            Statement stmt = dbRepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<User> users = new ArrayList<User>();
            while (rs.next()) {
                User user = new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("login")
                );
                users.add(user);
            }
            return users;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public User queryOne(String sql) {
        try {
            Statement stmt =dbRepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return new User(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("login")
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
