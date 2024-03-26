package week04;
import java.util.Scanner;

public class ShoppingCost {
    public static void main(String[] args) {
        int i = 0;
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("구입한 상품의 가격을 입력하세요 : ");
            cost += sc.nextInt();
            if (cost >= 100000) break;
        } while(true);
        System.out.println("총 구매 가격: " + cost);
    }
}
