import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "username", "password");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/students", "root", "12345");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Ask the user for their details
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            System.out.print("Enter your grade: ");
            int grade = scanner.nextInt();

            // Check if the student's details already exist in the database
            String query = "SELECT * FROM students WHERE name = '" + name + "' AND age = " + age;
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                // The student's details already exist, so update the record
                query = "UPDATE students SET grade = " + grade + " WHERE name = '" + name + "' AND age = " + age;
                stmt.executeUpdate(query);
                System.out.println("Student details updated");
            } else {
                // The student's details do not exist, so insert a new record
                query = "INSERT INTO students (name, age, grade) VALUES ('" + name + "', " + age + ", " + grade + ")";
                stmt.executeUpdate(query);
                System.out.println("Student details added");
            }

            // Close the statement and connection
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}