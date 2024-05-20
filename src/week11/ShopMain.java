package week11;
import java.util.Scanner;

class Shop{
    private int qty = 0;
    private String shopName = "", owner = "";

    void print_info() {
        System.out.println("가게 이름: " + shopName);
        System.out.println("가게 주인: " + owner);
        System.out.println("취급 품목 개수: " + qty);
    }
    void reduce_qty() {
        int new_qty = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("갱신할 품목 개수를 입력하세요: "); new_qty = sc.nextInt();
        qty = new_qty;
        sc.close();
    }
    void reduce_qty(int tmp) {
        qty = tmp;
    }
    public Shop(String shopName) {
        this(shopName, "NULL", -1);
    }
    public Shop(String shopName, String owner) {
        this(shopName, owner, -1);
    }
    public Shop(String shopName, String owner, int qty) {
        this.shopName = shopName;
        this.owner = owner;
        this.qty = qty;
    }
    public Shop() {
        shopName = "NULL";
        owner = "NULL";
        qty = -1;
    }
}

public class ShopMain {
    public static void main(String[] args) {
        Shop a = new Shop(); // Shop 클래스 자료형으로 a객체 생성
        a.print_info(); // 객체 a에 있는 print_info 메소드 호출
        Shop b = new Shop("costco", "asdf");
        b.print_info();
        b.reduce_qty();
        b.print_info();
        b.reduce_qty(1000);
        b.print_info();
    }
}
