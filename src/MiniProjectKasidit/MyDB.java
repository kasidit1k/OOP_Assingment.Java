package MiniProjectKasidit;

import java.sql.*;
import java.util.ArrayList;

public class MyDB {

    Connection conn;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {
        String url = "jdbc:mysql://localhost:3308/studentdb";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception ex) {
            System.out.println("ข้อผิดพลาด: ไม่สามารถเชื่อมต่อได้");
            System.out.println("ERROR : " + ex);
            return null;
        }
    }

    public int stmtCreInsUpdDel(String sql) {
        int row = 0;
        try {
            conn = connect();
            stmt = conn.createStatement();
            row = stmt.executeUpdate(sql);
            return row;
        } catch (SQLException ex) {
            System.out.println("ข้อผิดพลาด: ไม่สามารถดำเนินการค้นหาได้");
            System.out.println("ข้อผิดพลาด : " + ex);
            return row;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public ArrayList<HotelReserver> selectQuery(String sql) {
        HotelReserver hrs;
        try {
            conn = connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            ArrayList<HotelReserver> hotelReserversList = new ArrayList<>();
            while (rs.next()) {
                hrs = new HotelReserver();
                hrs.setId(rs.getInt(1));
                hrs.setName(rs.getString(2));
                hrs.setSurname(rs.getString(3));
                hrs.setRoomtype(rs.getString(4));
                hrs.setPeriod(rs.getString(5));
                hrs.setDayscount(rs.getInt(6));
                hrs.setTotalprice(rs.getInt(7));
                hotelReserversList.add(hrs);  // เพิ่ม hrs เข้าไปใน List
            }
            return hotelReserversList;
        } catch (Exception ex) {
            System.out.println("ข้อผิดพลาด: ไม่สามารถรับข้อมูลได้");
            System.out.println("ข้อผิดพลาด" + ex);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                // ตรวจสอบข้อผิดพลาดการปิดการเชื่อมต่อ
                System.out.println("Error closing resources: " + ex);
            }
        }
    }

    public ResultSet selectQueryData(String sql) {
        try {
            conn = connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            System.out.println("ERROR : Cannot get Data");
            System.out.println("ERROR : " + e);
            return null;
        }
    }

    public static void main(String[] args) {
        MyDB db = new MyDB();
        Connection cc = db.connect();
        System.out.println("con = " + cc);
    }
}
