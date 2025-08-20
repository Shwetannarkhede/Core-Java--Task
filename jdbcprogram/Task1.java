package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;

public class Task1 {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/capgeminii";
		String username = "root";
		String password = "Shweta@123";

		Connection c = DriverManager.getConnection(url, username, password);

		if (c != null)
			System.out.println("Database connected...");
		else
			System.out.println("Database NOT connected...");
	}
}
