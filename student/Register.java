package student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import student.Member.Book;

import java.io.IOException;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("type").equals("student")) {
		String uname=request.getParameter("uname");
		String age=request.getParameter("age");
		String city=request.getParameter("city");
		String department =request.getParameter("department");
		String sslc_score =request.getParameter("10th Score");
		String hsc_score=request.getParameter("12th Score");
		String year_of_study=request.getParameter("year of study");
		String elective_1=request.getParameter("elective 1");
		String elective_2=request.getParameter("elective 2");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String email_id=request.getParameter("email-id");
		
		
		Member member=new Member(uname,age ,city,department,sslc_score,hsc_score,year_of_study,elective_1,elective_2,phone,address,email_id);
		RegisterDao rdao=new RegisterDao();
		String result=rdao.insert(member);
		response.getWriter().println(result);
		
		
	}
		else if(request.getParameter("type").equals("library"))
		{
			String library_card_no =request.getParameter("library card.no");
			String no_of_library_cards =request.getParameter("no.of.library cards");
			String cards_issued =request.getParameter("Cards Issued");
			String total_books_issued =request.getParameter("Total Books Issued");
			String books_in_hand =request.getParameter("Books in Hand");
			String books_returned =request.getParameter("Books Returned");
			String book_category =request.getParameter("book category");
			String book_author =request.getParameter("book author");
			String book_publisher_name =request.getParameter("book publisher name");
			String book_name=request.getParameter("book name");
			String book_edition=request.getParameter("book edition");
			String book_volume_no=request.getParameter("book volume.no");
			
			Book member=new Member.Book(library_card_no,no_of_library_cards,cards_issued,total_books_issued,books_in_hand,books_returned,book_category,book_author,book_publisher_name,book_name,book_edition,book_volume_no);

			
			RegisterDao rdao=new RegisterDao();
			String result=rdao.insert1(member);
			response.getWriter().println(result);
		}
	
}
}