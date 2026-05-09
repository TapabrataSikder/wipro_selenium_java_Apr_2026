	package Library;
	import java.sql.*;
	import java.util.Scanner;
	
	public class TransactionService {
		public static void issueBook(Scanner sc) {
		    try (Connection con = DBConnection.getConnection()) {
		        System.out.print("Enter Book ID: ");
		        int bId = sc.nextInt();
		        System.out.print("Enter Member ID: ");
		        int mId = sc.nextInt();
	
		        String checkSql = "SELECT quantity FROM books WHERE book_id = ?";
		        PreparedStatement checkPs = con.prepareStatement(checkSql);
		        checkPs.setInt(1, bId);
		        ResultSet rs = checkPs.executeQuery();
	
		        if (rs.next() && rs.getInt("quantity") > 0) {
		            int currentQty = rs.getInt("quantity");
	
		            String sqlTrans = "INSERT INTO transactions (book_id, member_id) VALUES (?, ?)";
		            PreparedStatement psTrans = con.prepareStatement(sqlTrans);
		            psTrans.setInt(1, bId);
		            psTrans.setInt(2, mId);
		            psTrans.executeUpdate();
	
		            String sqlUpdate = "UPDATE books SET quantity = ? WHERE book_id = ?";
		            PreparedStatement psUpdate = con.prepareStatement(sqlUpdate);
		            psUpdate.setInt(1, currentQty - 1);
		            psUpdate.setInt(2, bId);
		            psUpdate.executeUpdate();
	
		            System.out.println("✅ Book issued. Left stock: " + (currentQty - 1));
		        } else {
		            System.out.println("❌ Sorry, this book is currently Out of Stock!");
		        }
		    } catch (Exception e) { e.printStackTrace(); }
		}
		
		
		public static void viewTransaction() {
		    try (Connection con = DBConnection.getConnection()) {

		        String sql = "SELECT t.transaction_id, b.title, m.name, t.issue_date, t.return_date, " +
		                     "DATEDIFF(IFNULL(t.return_date, CURDATE()), t.issue_date) as duration " +
		                     "FROM transactions t " +
		                     "JOIN books b ON t.book_id = b.book_id " +
		                     "JOIN members m ON t.member_id = m.member_id";
		        
		        Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery(sql);

		        System.out.printf("\n%-5s %-20s %-15s %-12s %-12s %-5s\n", 
		                          "ID", "Book", "Member", "Issued", "Returned", "Days");
		        System.out.println("---------------------------------------------------------------------------");
		        
		        while (rs.next()) {
		            String retDate = rs.getString("return_date") == null ? "Not Returned" : rs.getString("return_date");
		            System.out.printf("%-5d %-20s %-15s %-12s %-12s %-5d\n",
		                    rs.getInt("transaction_id"), 
		                    rs.getString("title"), 
		                    rs.getString("name"), 
		                    rs.getString("issue_date"),
		                    retDate,
		                    rs.getInt("duration"));
		        }
		    } catch (Exception e) { e.printStackTrace(); }
		}
		
	}