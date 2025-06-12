import java.sql.*;

public class GroupByClause {
    public static void main(String args[]) {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs1 = null;

        try {
            // 1. Load the Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 2. Establish connection
            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", 
                "system", 
                "@Suhana786"
            );
            System.out.println("Database connected successfully!");

            // 3. Create statement
            stmt = con.createStatement();

            // 4. Execute GROUP BY query
            rs1 = stmt.executeQuery("SELECT COUNT(*), surname FROM shinchan1 GROUP BY surname");

            // 5. Process results
            System.out.println("Count\tSurname");
            System.out.println("------------------");
            while(rs1.next()) {
                System.out.println(rs1.getInt(1) + "\t" + rs1.getString(2));
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Oracle JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database error occurred!");
            e.printStackTrace();
        } finally {
            // 6. Close resources in reverse order
            try {
                if (rs1 != null) rs1.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources!");
                e.printStackTrace();
            }
        }
    }
}