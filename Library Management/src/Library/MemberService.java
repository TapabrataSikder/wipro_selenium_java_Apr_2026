package Library;
import java.sql.*;
import java.util.Scanner;

public class MemberService {
    public static void registerMember(Scanner sc) {
    	sc.nextLine();
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Member Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            String sql = "INSERT INTO members (name, email) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);

            ps.executeUpdate();
            System.out.println("✅ Member registered successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void viewMember() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM members";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.printf("\n%-10s %-25s %-25s %-15s\n", "member_id", "name", "email", "join_date");
            System.out.println("-----------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-10d %-25s %-25s %-15s\n",
                        rs.getInt("member_id"), rs.getString("name"), 
                        rs.getString("email"), rs.getString("join_date"));
            }
        } catch (Exception e) { e.printStackTrace(); }
    }

}
    
