import java.util.ArrayList;

class Book {
  private String title;
  private String author;
  private String ISBN;

  public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }

  public String displayBook() {
    return "Title: " + title + "Author: " + author + "ISBN: " + ISBN;
  }

  public String getIsbn() {
    return ISBN;
  }
}

public class BookCollection {
  private ArrayList<Book> collection = new ArrayList();

  public void add(Book b) {
    collection.add(b);
    System.out.println("Added: " + b);
  }

  public void removeBook(String ISBN) {
    for (int i = 0; i < collection.size(); i++) {
      if (collection.get(i).getIsbn() == ISBN) {
        collection.remove(i);
        i--;
        System.out.println("Remove Book with ISBN:" + ISBN);
      }
    }
  }

  public void listBooks() {
    for (Book b : collection)
      System.out.println(b);
  }

  public static void main(String[] args) {
    Book b1 = new Book("BOOK", "shdf", "11323");
    Book b2 = new Book("asdOOK", "sssddhdf", "1132");
    Book b3 = new Book("aOOddsK", "shdsdddf", "113");
    Book b4 = new Book("aOOsdsK", "shdfsd", "1136");
    BookCollection c = new BookCollection();
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);
    c.listBooks();
  }

}
