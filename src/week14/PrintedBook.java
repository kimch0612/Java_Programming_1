package week14;

abstract class BookType{
    String title, author;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public BookType(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void showInfo();
}

public class PrintedBook extends BookType {
    public static void main(String[] args) {
        
    }
}
