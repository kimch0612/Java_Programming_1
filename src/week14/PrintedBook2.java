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

public class PrintedBook2 extends BookType {
    int pages;
    public PrintedBook2(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }
    void showInfo() { // 구현한 메소드 (implements)
        System.out.println(title + " " + author + " " + pages);
    }
    public static void main(String[] args) {
        BookType myBook = new PrintedBook2("어린왕자", "생쥐", 200);
        myBook.showInfo();
        myBook.setAuthor("조지 우웰");
        myBook.setTitle("1984");
        myBook.showInfo();
    }
}

// 시험 범위는 interface까지, 문제는 10문제 내외로
// 중간고사처럼 문제를 내지는 않을거고, 출력 결과나 오류가 있다면 왜 오류가 나는지, 메모리 구동 구조, 코드 빈칸 넣기 등이 나올 예정
// 오픈북이고, 시험 시간은 10시부터 시작