import java.sql.*;
import java.io.*;

public class createTable{
	public static void main(String args[]) throws Exception{
		Connection con;
		Statement stmt;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "@Suhana786");
		System.out.println("database connected");

		stmt = con.createStatement();

		stmt.executeUpdate("Create table shinchan1(id number(3), name varchar2(20), surname varchar2(20), age number(2), check(age > 0 AND age < 100))");
		System.out.println("table created");

		stmt.executeUpdate("insert into shinchan1 values(1, 'Shinchan', 'Nohara', 5)");
		stmt.executeUpdate("insert into shinchan1 values(2, 'Himawari', 'Nohara', 1)");
		stmt.executeUpdate("insert into shinchan1 values(3, 'Misae', 'Nohara', 29)");
		stmt.executeUpdate("insert into shinchan1 values(4, 'Hiroshi', 'Nohara', 35)");
		stmt.executeUpdate("insert into shinchan1 values(5, 'Kazama', 'Kun', 5)");
		stmt.executeUpdate("insert into shinchan1 values(6, 'Nene', 'Sakurada', 5)");
		stmt.executeUpdate("insert into shinchan1 values(7, 'Bo', 'Suzuki', 5)");
		stmt.executeUpdate("insert into shinchan1 values(8, 'Masao', 'Sato', 5)");
		stmt.executeUpdate("insert into shinchan1 values(9, 'Action', 'Kamen', 30)");
		stmt.executeUpdate("insert into shinchan1 values(10, 'Miss', 'Yoshinaga', 25)");
		System.out.println("10 values inserted");

		con.close();
	}
}