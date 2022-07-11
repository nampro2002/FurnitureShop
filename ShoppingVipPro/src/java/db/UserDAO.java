/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDAO extends DBContext {

    public User getUser(int accountId) {
        String sql = "select u.id,u.First_Name,u.Last_Name,u.Birthday,u.Gender,u.Email,u.PhoneNumber,u.Address, u.AccountId from UserInfo u inner join Account a on u.AccountId = a.id where u.AccountId =?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, accountId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getBoolean(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkDuplicateEmail(String email) {
        String sql = "select email from UserInfo where email = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void updatePass(String password, int AccountId) {
        try {
            String sql = "UPDATE [dbo].[UserInfo]\n"
                    + "   SET \n"
                    + "      [Password] = ?\n"
                    + "\n"
                    + " WHERE AccountId = ?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, password);
            st.setInt(2, AccountId);
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getAccountId(String email) {
        String sql = "select AccountId from UserInfo where email = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, email);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static void main(String[] args) {
        UserDAO d = new UserDAO();
        System.out.println(d.getAccountId("nampro2k2@gmail.com"));
    }

    public void addNewUser(String firstname, String lastname, String email, String phone, String username, String password) {
        try {
            String sql = "INSERT INTO [dbo].[UserInfo]\n"
                    + "           ([First_Name]\n"
                    + "           ,[Last_Name]\n"
                    + "           ,[Email]\n"
                    + "           ,[PhoneNumber]\n"
                    + "           ,[Username]\n"
                    + "           ,[Password])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, firstname);
            st.setString(2, lastname);
            st.setString(3, email);
            st.setString(4, phone);
            st.setString(5, username);
            st.setString(6, password);
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getUsername(int accountId) {
        String sql = "SELECT\n"
                + "[Username]\n"
                + "FROM [ProjectPRO].[dbo].[UserInfo]\n"
                + "where AccountId = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, accountId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String getPassword(int accountId) {
        String sql = "SELECT\n"
                + "[Password]\n"
                + "FROM [ProjectPRO].[dbo].[UserInfo]\n"
                + "where AccountId = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, accountId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateInfo(String firstname, String lastname, boolean gender, String birthday, String phone, String address, int accountId) {
        try {
            String sql = "UPDATE [dbo].[UserInfo]\n"
                    + "   SET [First_Name] = ?\n"
                    + "      ,[Last_Name] = ?\n"
                    + "      ,[Birthday] = ?\n"
                    + "      ,[Gender] = ?\n"
                    + "      ,[PhoneNumber] = ?\n"
                    + "      ,[Address] = ?\n"
                    + " WHERE AccountId =?";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, firstname);
            st.setString(2, lastname);
            st.setString(3, birthday);
            st.setBoolean(4, gender);
            st.setString(5, phone);
            st.setString(6, address);
            st.setInt(7, accountId);
            st.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        String sql = "select u.id,u.First_Name,u.Last_Name,u.Birthday,u.Gender,u.Email,u.PhoneNumber,u.Address, u.AccountId from UserInfo u inner join Account a on u.AccountId = a.id";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getBoolean(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
                list.add(user);
            }
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
