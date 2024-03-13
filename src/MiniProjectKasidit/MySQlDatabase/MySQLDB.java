package MiniProjectKasidit.MySQlDatabase;

import MiniProjectKasidit.info.HeightWeightInfo;
import java.sql.*;
import java.util.ArrayList;


public class MySQLDB {
    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {  
        String url = "jdbc:mysql://localhost:3308/studentdb";
        String user = "root";
        String password = "";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password); 
            return con;
        } catch (Exception e) {
            System.out.println("เกิดข้อผิดพลาด: ไม่สามารถเชื่อมต่อได้");
            System.out.println("ข้อผิดพลาด : " + e); 
            return null; //ส่งคืน Connection 
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
            System.out.println("เกิดข้อผิดพลาด : ไม่สามารถดำเนินการค้นหาได้");
            System.out.println("ข้อผิดพลาด : " + e);
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

    public ArrayList<HeightWeightInfo> selectQuery(String sql) {   
        HeightWeightInfo std;
        try {
            con = connect(); 
            
            stmt = con.createStatement(); 
            rs = stmt.executeQuery(sql); 
            ArrayList<HeightWeightInfo> studentList = new ArrayList<>(); 
            while (rs.next()) { 
                std = new HeightWeightInfo(); 
                std.setId(rs.getString(1)); 
                std.setName(rs.getString(2));
                std.setSurname(rs.getString(3));
                std.setWeight(rs.getDouble(4));
                std.setHeight(rs.getDouble(5));
                std.setWeightResult(rs.getString(6));
                studentList.add(std);
            }
            return studentList; 
        } catch (Exception e) {
            System.out.println("ข้อผิดพลาด : ไม่สามารถรับข้อมูลได้");
            System.out.println("ข้อผิดพลาด : " + e);
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
            System.out.println("ข้อผิดพลาด : ไม่สามารถรับข้อมูลได้");
            System.out.println("ข้อผิดพลาด : " + e);
            return null;
        }
    }
    public static void main(String[] args) {
        MySQLDB db = new MySQLDB();
        Connection cc = db.connect();
        System.out.println("con = "+cc);
    }
}