package dustmqwkd;

public class Bookbook01 {
	
	public String name;		//책이름
	public String writer;	//작가
	public int rentdays;	//대여기간
	public int codenumber;	//코드번호
	public int rentprice;	//대여금액
	public int publisher;	//출판사
	public int category;	//분류
	public int libraryname;	//책보유도서관
	
	public Bookbook01() {}
	
	public Bookbook01(String name) {
		this.name = name;
	}
	
	public Bookbook01(String name, int codenumber) {
		this(name);
		this.codenumber = codenumber;
	}
	
	public Bookbook01(String name, int codenumber, int rentdays) {
		this(name, codenumber);
		this.rentdays = rentdays;
	}
	
		
}
