package examples;

class Book {

	private String title; 			// 제목
	private int price; 				// 가격
	private String author;			// 저자
	private String publisher;		// 출판사
	private int printYear = 2018;	// 발행년도
	private String isbn;			// ISBN
	private int pageNum = 443;		// 페이지수
	
	public void info() {
		System.out.println("========== 도서 정보 ==========");
		System.out.printf("제목 : %s\n", title);
		System.out.printf("가격 : %s\n", price);
		System.out.printf("저자 : %s\n", author);
		System.out.printf("출판사 : %s\n", publisher);
		System.out.printf("발행년도 : %s\n", printYear);
		System.out.printf("ISBN : %s\n", isbn);
		System.out.printf("페이지수 : %s\n", pageNum);
		System.out.println("===============================");
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		
		if(title.length() < 50) { // 최대 50자 이내
			this.title = title;
		}
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price >= 0 && price <= 100000) { // 0~100,000원
			this.price = price;			
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrintYear() {	
		return this.printYear;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPageNum() {
		return pageNum;
	}
	
}
