import java.sql.*;
import java.io.*;

public class betweenClause {

    public static void main(String args[]) throws Exception {
        ResultSet rs3;
        Connection con;
        Statement stmt;

        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "@Suhana786");
        stmt = con.createStatement();
        
        // Showing between clause
        rs3 = stmt.executeQuery("select name, id from shinchan1 where id between 1 and 5");
        
        // Print formatted table header
        System.out.println("+----------------------+-----+");
        System.out.println("| Name                 | ID  |");
        System.out.println("+----------------------+-----+");
        
        try {
            while (rs3.next()) {
                // Format each row with fixed-width columns
                System.out.printf("| %-20s | %3d |\n", 
                                 rs3.getString(1), 
                                 rs3.getInt(2));
            }
            System.out.println("+----------------------+-----+");
        } catch (Exception ff1) {
            System.out.println(ff1);
        } finally {
            con.close();
        }
    }
}