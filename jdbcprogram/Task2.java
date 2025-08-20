package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task2 {
			public Connection connect() throws Exception {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/college?useSSL=false";
				String username = "root";
				String password = "Shweta@123";
				Connection c = DriverManager.getConnection(url, username, password);
				return c;
			}
			
			
              public void DeleteById(int n) throws Exception {
				
				Connection c = connect();
				String query = "delete from book where id = ?;";
				PreparedStatement stmt = c.prepareStatement(query);
				stmt.setInt(1, n);
				stmt.executeUpdate();
				System.out.println("Book deleted...");
			}

				
			
			public void addData(int x, String y, String z) throws Exception {
				
				Connection c = connect();
				String query = "insert into book values(?,?,?);";
				PreparedStatement stmt = c.prepareStatement(query);
				stmt.setInt(1, x);
				stmt.setString(2, y);
				stmt.setString(3, z);
				stmt.executeUpdate();
				System.out.println("Book added...");
			}
           
			public void updateData(int n) throws Exception {
				Connection c= connect();
				String query= "update book set name = 'Mahabhart' where id =?; ";
				PreparedStatement stmt = c.prepareStatement(query);
				stmt.setInt(1, n);
				stmt.executeUpdate();
				System.out.println("Book Update...");
			}
			public void readById(int n) throws Exception {
				
				Connection c = connect();
				String query = "select * from book where id = ?;";
				PreparedStatement stmt = c.prepareStatement(query);
				stmt.setInt(1, n);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("name") + " written by " + rs.getString("author"));
				}
			}
			
			public void readAllData() throws Exception {
				Connection c = connect();
				String query = "select * from book;";
				PreparedStatement stmt = c.prepareStatement(query);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString("name") + " written by " + rs.getString("author"));
				}
			}
			
			public static void main(String[] args) throws Exception {
			
				Task2 h = new Task2();
				
//				h.addData(1, "Ramayan", "valmik");
//				h.addData(2, "mahabhart", "vays");
//				h.addData(3, "Bhagvat gita", "shree krishna");
				//h.addData(4, "Bhaagvat", "Sant Eknath");
			h.DeleteById(4);
			h.updateData(2);
				h.readAllData();
				
			}
}
