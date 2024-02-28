package MiniProject;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

public class MySQLDB {

    Connection con;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pstmt;

    public Connection connect() {
        String url = "jdbc:mysql://localhost:3306/Studentdb";
        String user = "root";
        String password = "0630281356oni";
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("con = " + con);
            return con;
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
            System.out.println("ติดต่อฐานข้อมูลไม่ได้ค่ะ");
            return null;
        }
    }
    
    

    public ArrayList<Student> selectQuery(String sql) {
        Student std;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            ArrayList<Student> studentList = new ArrayList<>();
            while (rs.next()) {
                std = new Student();
                std.setId(rs.getString(1));
                std.setName(rs.getString(2));
                std.setSurname(rs.getString(3));
                studentList.add(std);
            }
            return studentList;
        } catch (Exception e) {
            System.out.println("e = " + e.getMessage());
            System.out.println("ดึงข้อมูลไม่ได้ค่ะ");
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("เกิดข้อผิดพลาดในการปิด ResultSet, Statement หรือ Connection: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MySQLDB myDB = new MySQLDB();
        myDB.selectQuery("SELECT * FROM STUDENT");
    }

    PreparedStatement prepareStatement(String selectSql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

