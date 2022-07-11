/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author ADMIN
 */
public class ProductDAO extends DBContext {

//    public ArrayList<Product> getAll() throws SQLException {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "select * from Product";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                list.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("image"),
//                        rs.getDouble("price")));
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return list;
//    }
//
//    public ArrayList<Product> getAll1(String id) throws SQLException {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "select * from Product where id=?";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, id);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                list.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("image"),
//                        rs.getDouble("price")));
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return list;
//    }
//
//    public ArrayList<Product> getAllTop3() throws SQLException {
//        ArrayList<Product> list = new ArrayList<>();
//        String sql = "select top 3* from Product";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            ResultSet rs = st.executeQuery();
//            while (rs.next()) {
//                list.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("image"),
//                        rs.getDouble("price")));
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return list;
//    }
    //update
//    public Product getProductById(String id) {
//        String sql = "select * from Product where id=?";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setString(1, id);
//            ResultSet rs = st.executeQuery();
//            if (rs.next()) {
//                return new Product(rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getDouble(4));
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return null;
//    }
    public void delete(String id) {
        String sql = "delete from Product where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update(Product s) {
        String sql = "update product set id=?,name=?,image=?,price=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, s.getId());
            st.setString(2, s.getName());
            st.setString(3, s.getImage());
            st.setDouble(4, s.getPrice());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public boolean existedProduct(String id) {
        String sql = "select * from Product where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    public void insert(Product s) {
        String sql = "insert into student values(?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, s.getId());
            st.setString(2, s.getName());
            st.setString(3, s.getImage());
            st.setDouble(4, s.getPrice());
            ResultSet rs = st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<Product> getListByPage(ArrayList<Product> list1, int start, int end) {
        ArrayList<Product> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(list1.get(i));
        }
        return list;
    }

    public ArrayList<Product> getProductWithNumber(int start, int end) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product order by id\n"
                    + "offset ? row fetch next ? rows only";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, start);
            st.setInt(2, end);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
//                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4),rs.getString(5), rs.getInt(6), rs.getInt(7));
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .image(rs.getString(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .quantity(rs.getInt(6))
                        .categoryId(rs.getInt(7))
                        .build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Product> getProductWithPagging(int page, int PAGE_SIZE) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select * from Product order by id\n"
                    + "offset (?-1)*? row fetch next ? rows only";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, page);
            st.setInt(2, PAGE_SIZE);
            st.setInt(3, PAGE_SIZE);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .image(rs.getString(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .quantity(rs.getInt(6))
                        .categoryId(rs.getInt(7))
                        .build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Product> getProductWithPaggingSortBy(int page, int PAGE_SIZE, int selectId) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from Product order by id offset (?-1)*? row fetch next ? rows only";
        if (selectId == 1) {
            sql = "select * from Product order by name offset (?-1)*? row fetch next ? rows only";
        } else if (selectId == 2) {
            sql = "select * from Product order by price offset (?-1)*? row fetch next ? rows only";
        }
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, page);
            st.setInt(2, PAGE_SIZE);
            st.setInt(3, PAGE_SIZE);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .image(rs.getString(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .quantity(rs.getInt(6))
                        .categoryId(rs.getInt(7))
                        .build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int getTotalProduct() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select count(id) from Product ";
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ArrayList<Product> getAll() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from Product";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .image(rs.getString(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .quantity(rs.getInt(6))
                        .categoryId(rs.getInt(7))
                        .build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) throws SQLException {
        ProductDAO d = new ProductDAO();
        ArrayList<Product> list = d.getProductWithPaggingSortBy(1, 8, 3);
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public ArrayList<Product> getProductsByCategoryId(int categoryId) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "select * from product where cateID = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, categoryId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .image(rs.getString(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .quantity(rs.getInt(6))
                        .categoryId(rs.getInt(7))
                        .build();
                list.add(product);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Product getProductById(int productId) {
        String sql = "select * from product where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, productId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product product = Product.builder()
                        .id(rs.getInt(1))
                        .name(rs.getString(2))
                        .image(rs.getString(3))
                        .price(rs.getDouble(4))
                        .description(rs.getString(5))
                        .quantity(rs.getInt(6))
                        .categoryId(rs.getInt(7))
                        .build();
                return product;
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
