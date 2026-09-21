class Book {
  private String title;
  private String author;

  public Book(String title) {
    this.title = title;
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  void showBook() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
  }
}

public class Overloading {
  public static void main(String[] args) {
    Book b1 = new Book("OOP");
    Book b2 = new Book("DSA", "xyz");
    b1.showBook();
    b2.showBook();
  }
}
