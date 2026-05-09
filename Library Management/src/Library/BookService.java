package Library;

import java.sql.*;
import java.util.Scanner;

public class BookService {

    public static void addBook(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Book Title: ");
            String title = sc.nextLine();
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            System.out.print("Enter Genre/Type: ");
            String type = sc.nextLine();
            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine(); 

            String sql = "INSERT INTO books (title, author, type, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, type);
            ps.setInt(4, qty);

            ps.executeUpdate();
            System.out.println("✅ " + qty + " copies added successfully.");
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void viewBooks() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM books";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.printf("\n%-5s %-25s %-20s %-15s %-10s\n", "ID", "Title", "Author", "Type", "Quantity Left");
            System.out.println("-----------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%-5d %-25s %-20s %-15s %-10d\n",
                        rs.getInt("book_id"), rs.getString("title"), 
                        rs.getString("author"), rs.getString("type"), rs.getInt("quantity"));
            }
        } catch (Exception e) { e.printStackTrace(); }
    }
    
}