package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import student.Member.Book;

public class RegisterDao {
	private String dburl = "jdbc:mysql://localhost:3306/userdb";
	private String dbuname = "root";
	private String dbpassword = "";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";

	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public String insert(Member member) {
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into member values(?,?,?,?,?,?,?,?,?,?,?,?)";
		String result="Data Entered Successfully";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getUname());
			ps.setString(2, member.getAge());
			ps.setString(3, member.getCity());
			ps.setNString(4, member.getDepartment());
			ps.setString(5, member.getSslc_score());
			ps.setString(6, member.getHsc_score());
			ps.setString(7, member.getYear_of_study());
			ps.setString(8, member.getElective_1());
			ps.setString(9, member.getElective_2());
			ps.setString(10, member.getPhone());
			ps.setString(11, member.getAddress());
			ps.setString(12, member.getEmail_id());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			result="Data Not Entered Successfully";
			e.printStackTrace();
		}
		return result;
		}
		public String insert1(Book book) {
			loadDriver(dbdriver);
			Connection con = getConnection();
			String sql = "insert into book values(?,?,?,?,?,?,?,?,?,?,?,?)";
			String result="Data Entered Successfully";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, book.getLibrary_card_no());
				ps.setString(2, book.getNo_of_library_cards());
				ps.setString(3, book.getCards_issued());
				ps.setNString(4, book.getTotal_books_issued());
				ps.setString(5, book.getBooks_in_hand());
				ps.setString(6, book.getBooks_returned());
				ps.setString(7, book.getBook_category());
				ps.setString(8, book.getBook_author());
				ps.setString(9, book.getBook_publisher_name());
				ps.setString(10, book.getBook_name());
				ps.setString(11, book.getBook_edition());
				ps.setString(12, book.getBook_volume_no());
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				result="Data Not Entered Successfully";
				e.printStackTrace();
			}
		return result;

	}
}