package week11;
import java.util.Scanner;

class Shop{
    int qty = 0;
    String shopName = "", owner = "";

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
        Shop a = new Shop();
        a.print_info();
        Shop b = new Shop("costco", "asdf");
        b.print_info();
        b.reduce_qty();
        b.print_info();
    }
}
