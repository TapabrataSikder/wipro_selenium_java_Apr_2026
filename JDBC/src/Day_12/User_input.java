package Day_12;
import java.sql.*;
import java.util.Scanner;

public class User_input {

    public static void userInput(Scanner sc) {
        try (Connection con = DBConnection_day_12.getConnection()) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            int per = sc.nextInt();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            String sql = "INSERT INTO students (name, per, email, age, salary) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, per);
            ps.setString(3, email);
            ps.setInt(4, age);
            ps.setDouble(5, salary);
            ps.executeUpdate();
            System.out.println("✅ Student added.");
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void viewRecentStudents() {
        String sql = "SELECT * FROM students WHERE created_at >= DATE_SUB(NOW(), INTERVAL 7 DAY)";
        displayTable(sql);
    }

    public static void showCountByAge() {
        try (Connection con = DBConnection_day_12.getConnection()) {
            String sql = "SELECT age, COUNT(*) as total FROM students GROUP BY age";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\nAge Group | Count");
            while (rs.next()) {
                System.out.println(rs.getInt("age") + "       | " + rs.getInt("total"));
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void updateBonusSalary() {
        try (Connection con = DBConnection_day_12.getConnection()) {
            String sql = "UPDATE students SET salary = salary + 500 WHERE per > 90";
            int rows = con.createStatement().executeUpdate(sql);
            System.out.println("💰 Updated salary for " + rows + " high-performing students.");
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void showStudent() {
        displayTable("SELECT * FROM students");
    }

    private static void displayTable(String sql) {
        try (Connection con = DBConnection_day_12.getConnection()) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            String tableFormat = "%-6s %-15s %-10s %-20s %-10s %-10s\n";
            System.out.printf("\n" + tableFormat, "Roll", "Name", "Per", "Email", "Age", "Salary");
            while (rs.next()) {
                System.out.printf(tableFormat, rs.getInt("rollno"), rs.getString("name"), 
                                  rs.getInt("per"), rs.getString("email"), 
                                  rs.getInt("age"), rs.getDouble("salary"));
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
}