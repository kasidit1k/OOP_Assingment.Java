
package MiniProjectKasidit;

import java.sql.*;
import java.util.ArrayList;

public class MyDB {
    Connection conn;
    Statement stmt;
    ResultSet rs;
    
    public Connection connect(){
        String url = "jdbc:mysql://localhost:3308/studentdb";
        String user = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch(Exception ex){
            System.out.println("ข้อผิดพลาด: ไม่สามารถเชื่อมต่อได้");
            System.out.println("ERROR : "+ex);
            return null;
        }
    }
    
    public int stmtCreInsUpdDel(String sql){
        int row = 0;
        try {
            conn = connect();
            stmt = conn.
        } catch (Exception e) {
        }
    }
    
   
}
