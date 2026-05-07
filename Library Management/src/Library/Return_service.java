package Library;
import java.sql.*;
import java.util.Scanner;

public class Return_service {
    public static void returnBook(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Book ID to return: ");
            int bId = sc.nextInt();
            System.out.print("Enter Member ID: ");
            int mId = sc.nextInt();

            String sqlUpdateTrans = "UPDATE transactions SET return_date = CURDATE() " +
                                    "WHERE book_id = ? AND member_id = ? AND return_date IS NULL";
            
            PreparedStatement ps1 = con.prepareStatement(sqlUpdateTrans);
            ps1.setInt(1, bId);
            ps1.setInt(2, mId);
            int rows = ps1.executeUpdate();

            if (rows > 0) {

                String sqlUpdateQty = "UPDATE books SET quantity = quantity + 1 WHERE book_id = ?";
                PreparedStatement ps2 = con.prepareStatement(sqlUpdateQty);
                ps2.setInt(1, bId);
                ps2.executeUpdate();

                String sqlDiff = "SELECT DATEDIFF(return_date, issue_date) as days FROM transactions " +
                                 "WHERE book_id = ? AND member_id = ? ORDER BY transaction_id DESC LIMIT 1";
                PreparedStatement ps3 = con.prepareStatement(sqlDiff);
                ps3.setInt(1, bId);
                ps3.setInt(2, mId);
                ResultSet rs = ps3.executeQuery();
                
                if (rs.next()) {
                    System.out.println("Book returned successfully.");
                    System.out.println("Total days held: " + rs.getInt("days") + " days.");
                }
            } else {
                System.out.println("No active transaction found for this Book/Member ID.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}