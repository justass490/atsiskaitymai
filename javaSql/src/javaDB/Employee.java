package javaDB;

import java.sql.*;

public class Employee {
    public static void main(String[] args) throws Exception {
    createTable();
    }

    private static void createTable() throws Exception{
        try{
            Connection a = getConnection();
            Connection b = getConnection1();
            PreparedStatement createDB = a.prepareStatement("CREATE DATABASE db");
            PreparedStatement createTB = a.prepareStatement("CREATE TABLE db.employee(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255), surname varchar(255), salary int)");
            createDB.executeUpdate();
            createTB.executeUpdate();
            a.close();
            String query = "INSERT INTO `employee`(`id`, `name`, `surname`, `sallary`)" + "VALUES (?,?,?,?)+";
            PreparedStatement insert = b.prepareStatement(query);
            insert.setInt(1, 1);
            insert.setString(2,"Justas");
            insert.setString(3,"Sadauskas");
            insert.setInt(4, 900);
            insert.execute();
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("**function successful**");
        }
    }

    private static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306";
            String username = "root";
            String password = "";
            Class.forName(driver);

            Connection a = DriverManager.getConnection(url, username, password);
            System.out.println("**Connected succesfully**");
            return a;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    private static Connection getConnection1() throws Exception{
            try{
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/db";
                String username = "root";
                String password = "";
                Class.forName(driver);

                Connection b = DriverManager.getConnection(url, username, password);
                System.out.println("**Connected succesfully**");
                return b;
            }catch (Exception e){
                System.out.println(e);
            }
            return null;
        }
    }
