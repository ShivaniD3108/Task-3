package task3;

class Book {
	private int bookId;
	private String title;
	private String author;
	private boolean isAvailable=true;
	
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isAvailable() {
			return isAvailable;
	}
	
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public String toString() {
		return "\nBook id - " + bookId +", Title of the book - " + title + ", Author - "+ author;
//		}
	}
}
