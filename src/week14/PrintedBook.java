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
    int pages;
    public PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }
    void showInfo() {
        System.out.println(title + " " + author + " " + pages);
    }
    public static void main(String[] args) {
        BookType myBook = new PrintedBook("어린왕자", "ㅁㄴㅇㄹ", 400);
        myBook.showInfo();
    }
}
