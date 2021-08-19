/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/**
 *
 * @author haunguyen
 */
import java.net.ConnectException;
import java.sql.*;
import java.sql.DriverManager;
public class ketnoitest {
    public static void main(String[] args) {
        // TODO code application logic here
        // định nghĩa
        String userName = "sa";
        String passWord = "songlong";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Qly_StarPro";
        //
        try {
            // nạp driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url,userName,passWord);
            if(con != null){
                System.out.println("Kết nối chuẩn rồi !");
            }
                        
        } catch (Exception e) {
            System.out.println(" Có lỗi kết nối !" + e);
        }
        
    }
}
