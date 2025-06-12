import java.sql.*;

public class orderByClause {

    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load JDBC driver and establish connection
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "@Suhana786"
            );

            stmt = con.createStatement();
            
            // Execute query with ORDER BY clause
            rs = stmt.executeQuery("SELECT name, id FROM shinchan1 ORDER BY name");
            
            // Print formatted table header
            System.out.println("+----------------------+-----+");
            System.out.println("| Name                 | ID  |");
            System.out.println("+----------------------+-----+");
            
            // Process and display results
            while (rs.next()) {
                System.out.printf("| %-20s | %3d |%n", 
                                rs.getString("name"), 
                                rs.getInt("id"));
            }
            
            System.out.println("+----------------------+-----+");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            // Close resources in reverse order
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
            try { if (con != null) con.close(); } catch (SQLException e) {}
        }
    }
}