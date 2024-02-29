package Chap9;

import java.sql.*;
import java.util.ArrayList;


public class MySQL {

    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {   // Method
        String url = "jdbc:mysql://localhost:3308/studentdb";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get a connection");
            System.out.println("ERROR : " + e);
            return null;
        }
    }

    public int stmtCreInsUpdDel(String sql) {
        int row = 0;
        try {
            con = connect();
            stmt = con.createStatement();
            row = stmt.executeUpdate(sql);
            return row;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot execute query");
            System.out.println("ERROR : " + e);
            return row;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<StudentInfo1> selectQuery(String sql) {     //โยน sql เข้ามา  // Gui เรียก methodselectQuery
        StudentInfo1 std;
        try {
            con = connect(); //สร้างคอนเนคชั่น
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);  
            ArrayList<StudentInfo1> studentList = new ArrayList<>();
            while (rs.next()) { // resultSet คือ กลุ่มผลลัพธ์ที่ได้
                std = new StudentInfo1();
                std.setId(rs.getString(1)); // เก็ทตัวที่1
                std.setName(rs.getString(2));
                std.setSurname(rs.getString(3));
                studentList.add(std);
            }
            return studentList;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get data");
            System.out.println("ERROR : " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ResultSet selectQueryData(String sql) {
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get Data");
            System.out.println("ERROR : " + e);
            return null;
        }
    }
    public static void main(String[] args) {
        MySQL db = new MySQL();
        Connection cc = db.connect();
        System.out.println("con = "+cc);
    }
}