package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentMangement {

    public Connection connect() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Management";
        String username = "root";
        String password = "Shweta@123";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }

    public void createTable() throws Exception {
        Connection c = connect();
        String query = "CREATE TABLE IF NOT EXISTS Student (" +
                       "id INT PRIMARY KEY, " +
                       "name VARCHAR(100) NOT NULL, " +
                       "course VARCHAR(100) NOT NULL)";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.executeUpdate();
        System.out.println("Table Student Created.");
    }

    Scanner sc = new Scanner(System.in);

    public void start() throws Exception {
       
        while (true) {
            System.out.println("\n===== Student Records Manager =====");
            System.out.println("[1] -> Add Student");
            System.out.println("[2] -> Update Student");
            System.out.println("[3] -> Delete Student");
            System.out.println("[4] -> View Student by ID");
            System.out.println("[5] -> View All Students");
            System.out.println("[6] -> Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1: addStudent();
                    break;
                case 2: updateStudent();
                    break;
                case 3: deleteStudent();
                    break;
                case 4: viewById();
                    break;
                case 5: viewAllStudents();
                    break;
                case 6:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid !");
            }
        }
    }

    public void addStudent() throws Exception {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Connection c = connect();
        String query = "INSERT INTO Student VALUES(?,?,?)";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, course);
        stmt.executeUpdate();
        System.out.println("Student Data added successfully.");
    }

    public void updateStudent() throws Exception {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new course: ");
        String course = sc.nextLine();

        Connection c = connect();
        String query = "UPDATE Student SET name = ?, course = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, course);
        stmt.setInt(3, id);
        stmt.executeUpdate();
        System.out.println("Student Data updated successfully.");
    }

    public void deleteStudent() throws Exception {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        Connection c = connect();
        String query = "DELETE FROM Student WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        System.out.println("Student Data deleted successfully.");
    }

    public void viewById() throws Exception {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        Connection c = connect();
        String query = "SELECT * FROM Student WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(query);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            System.out.println("\n---- Student Details ----");
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Course: " + rs.getString("course"));
            System.out.println("-------------------------");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void viewAllStudents() throws Exception {
        Connection c = connect();
        String query = "SELECT * FROM Student";
        PreparedStatement stmt = c.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        System.out.println("\n---- Student List ----");
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Course: " + rs.getString("course"));
            System.out.println("-------------------------");
        }
    }

  
}
