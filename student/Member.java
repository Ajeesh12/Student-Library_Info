package student;

public class Member{
	private String uname,age ,city,department,sslc_score,hsc_score,year_of_study,elective_1,elective_2,phone,address,email_id;
	
	public Member(String uname, String age, String city, String department, String sslc_score, String hsc_score,
			String year_of_study, String elective_1, String elective_2, String phone, String address, String email_id) {
		super();
		this.uname = uname;
		this.age = age;
		this.city = city;
		this.department = department;
		this.sslc_score = sslc_score;
		this.hsc_score = hsc_score;
		this.year_of_study = year_of_study;
		this.elective_1 = elective_1;
		this.elective_2 = elective_2;
		this.phone = phone;
		this.address = address;
		this.email_id = email_id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSslc_score() {
		return sslc_score;
	}

	public void setSslc_score(String sslc_score) {
		this.sslc_score = sslc_score;
	}

	public String getHsc_score() {
		return hsc_score;
	}

	public void setHsc_score(String hsc_score) {
		this.hsc_score = hsc_score;
	}

	public String getYear_of_study() {
		return year_of_study;
	}

	public void setYear_of_study(String year_of_study) {
		this.year_of_study = year_of_study;
	}

	public String getElective_1() {
		return elective_1;
	}

	public void setElective_1(String elective_1) {
		this.elective_1 = elective_1;
	}

	public String getElective_2() {
		return elective_2;
	}

	public void setElective_2(String elective_2) {
		this.elective_2 = elective_2;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	

static class Book 
{
	private String library_card_no,no_of_library_cards,cards_issued,total_books_issued,books_in_hand,books_returned,book_category,book_author,book_publisher_name,book_name,book_edition,book_volume_no;
	

	public Book(String library_card_no, String no_of_library_cards, String cards_issued, String total_books_issued,
			String books_in_hand, String books_returned, String book_category, String book_author,
			String book_publisher_name, String book_name, String book_edition, String book_volume_no) {
		super();
		this.library_card_no = library_card_no;
		this.no_of_library_cards = no_of_library_cards;
		this.cards_issued = cards_issued;
		this.total_books_issued = total_books_issued;
		this.books_in_hand = books_in_hand;
		this.books_returned = books_returned;
		this.book_category = book_category;
		this.book_author = book_author;
		this.book_publisher_name = book_publisher_name;
		this.book_name = book_name;
		this.book_edition = book_edition;
		this.book_volume_no = book_volume_no;
	}

	public String getLibrary_card_no() {
		return library_card_no;
	}

	public void setLibrary_card_no(String library_card_no) {
		this.library_card_no = library_card_no;
	}

	public String getNo_of_library_cards() {
		return no_of_library_cards;
	}

	public void setNo_of_library_cards(String no_of_library_cards) {
		this.no_of_library_cards = no_of_library_cards;
	}

	public String getCards_issued() {
		return cards_issued;
	}

	public void setCards_issued(String cards_issued) {
		this.cards_issued = cards_issued;
	}

	public String getTotal_books_issued() {
		return total_books_issued;
	}

	public void setTotal_books_issued(String total_books_issued) {
		this.total_books_issued = total_books_issued;
	}

	public String getBooks_in_hand() {
		return books_in_hand;
	}

	public void setBooks_in_hand(String books_in_hand) {
		this.books_in_hand = books_in_hand;
	}

	public String getBooks_returned() {
		return books_returned;
	}

	public void setBooks_returned(String books_returned) {
		this.books_returned = books_returned;
	}

	public String getBook_category() {
		return book_category;
	}

	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_publisher_name() {
		return book_publisher_name;
	}

	public void setBook_publisher_name(String book_publisher_name) {
		this.book_publisher_name = book_publisher_name;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_edition() {
		return book_edition;
	}

	public void setBook_edition(String book_edition) {
		this.book_edition = book_edition;
	}

	public String getBook_volume_no() {
		return book_volume_no;
	}

	public void setBook_volume_no(String book_volume_no) {
		this.book_volume_no = book_volume_no;
	}
}

	
}