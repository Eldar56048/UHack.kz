package kz.edu.astanait.Repositories;

import kz.edu.astanait.Models.Appeal;
import kz.edu.astanait.Repositories.interfaces.IAppealRepository;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppealRepository implements IAppealRepository {
    MySQLRepository dbRepo = new MySQLRepository();
    public Appeal getAppealById(int id) {
        String sql = "Select * from appeal where appeal.id = "+id;
        return queryOne(sql);
    }

    public Appeal getAppealByIdAndCode(int id, String code) {
        String sql = "Select * from appeal where appeal.id="+id+" and code='"+code+"'";
        return queryOne(sql);
    }

    public int getCountAnsweredAppeal(){
        String sql = "SELECT count(id)'count' from appeal where answer!='null'";
        try {
            Statement stmt = dbRepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("count");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public int getCountAllAppeal(){
        String sql = "Select count(id)'count' from appeal";
        try {
            Statement stmt = dbRepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("count");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public ArrayList<Appeal> getAllAppeal(){
        String sql = "Select * from appeal";
        return  query(sql);
    }

    public ArrayList<Appeal> getAnsweredAppeals(){
        String sql = "SELECT * FROM `appeal` WHERE answer !='null' order by appeal.id desc";
        return query(sql);
    }

    public ArrayList<Appeal> getUnansweredAppeals(){
        String sql = "SELECT * FROM `appeal` WHERE answer ='null' order by appeal.id desc";
        return query(sql);
    }

    public int add(Appeal entity){
        try {
            String sql = "INSERT INTO appeal(name, surname, email, phone_number, micro_region, address, appeal, code, sent_date) " +
                    "VALUES(?, ?, ?, ?, ?, ?,?,?,?)";
            PreparedStatement stmt = dbRepo.getConnection().prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, entity.getName());
            stmt.setString(2, entity.getSurname());
            stmt.setString(3, entity.getEmail());
            stmt.setString(4, entity.getPhone_number());
            stmt.setString(5, entity.getMicro_region());
            stmt.setString(6, entity.getAddress());
            stmt.setString(7, entity.getAppeal());
            stmt.setString(8, entity.getCode());
            stmt.setDate(9, Date.valueOf(LocalDate.now()));
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

    public void update(Appeal entity) {
        String sql = "UPDATE  appeal SET response_date=?, answer= ?  where appeal.id=?";
        try {
            PreparedStatement stmt = dbRepo.getConnection().prepareStatement(sql);
            stmt.setDate(1,Date.valueOf(LocalDate.now()));
            stmt.setString(2,entity.getAnswer());
            stmt.setInt(3,entity.getId());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void remove(Appeal entity) {
        try {
            String sql = "Delete from appeal WHERE appeal.id = ?";
            PreparedStatement stmt = dbRepo.getConnection().prepareStatement(sql);
            stmt.setInt(1,entity.getId());
            stmt.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Appeal> query(String sql) {
        try {
            Statement stmt = dbRepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ArrayList<Appeal> appeals = new ArrayList<Appeal>();
            while (rs.next()) {
                Appeal appeal;
                if(sql.contains("!")){
                        appeal = new Appeal(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("micro_region"),
                        rs.getString("address"),
                        rs.getString("appeal"),
                        rs.getString("code"),
                        rs.getDate("sent_date"),
                        rs.getDate("response_date"),
                        rs.getString("answer")
                );}
                else{
                            appeal = new Appeal(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("surname"),
                            rs.getString("email"),
                            rs.getString("phone_number"),
                            rs.getString("micro_region"),
                            rs.getString("address"),
                            rs.getString("appeal"),
                            rs.getString("code"),
                            rs.getDate("sent_date"),
                            null,
                            rs.getString("answer")
                    );
                }
                appeals.add(appeal);
            }
            return appeals;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Appeal queryOne(String sql) {
        try {
            Statement stmt = dbRepo.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                if(rs.getString("answer").equals("null")){
                    return new Appeal(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("surname"),
                            rs.getString("email"),
                            rs.getString("phone_number"),
                            rs.getString("micro_region"),
                            rs.getString("address"),
                            rs.getString("appeal"),
                            rs.getString("code"),
                            rs.getDate("sent_date"),
                            null,
                            rs.getString("answer")
                    );
                }
                else{
                    return new Appeal(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("surname"),
                            rs.getString("email"),
                            rs.getString("phone_number"),
                            rs.getString("micro_region"),
                            rs.getString("address"),
                            rs.getString("appeal"),
                            rs.getString("code"),
                            rs.getDate("sent_date"),
                            rs.getDate("response_date"),
                            rs.getString("answer")
                    );
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
