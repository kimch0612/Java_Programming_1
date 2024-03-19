package week03;
import java.util.Scanner;

public class CoinSum {
    public static void main(String[] args) {
        int five_man = 0;
        int man = 0;
        int five_chun = 0;
        int chun = 0;
        int five_baek = 0;
        int baek = 0;
        int five_sip = 0;
        int sip = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("50000원은 몇 장?   ");
        five_man = sc.nextInt();
        System.out.print("10000원은 몇 장?   ");
        man = sc.nextInt();
        System.out.print("5000원은 몇 장?    ");
        five_chun = sc.nextInt();
        System.out.print("1000원은 몇 장?    ");
        chun = sc.nextInt();
        System.out.print("500원은 몇 개?     ");
        five_baek = sc.nextInt();
        System.out.print("100원은 몇 개?     ");
        baek = sc.nextInt();
        System.out.print("50원은 몇 개?      ");
        five_sip = sc.nextInt();
        System.out.print("10원은 몇 개?      ");
        sip = sc.nextInt();
        System.out.println("-----------------------");
        int total = (50000 * five_man) + (10000 * man) + (5000 * five_chun) + (1000 * chun) + (500 * five_baek) + (100 * baek) + (50 * five_sip) + (10 * sip);
        String str = String.format("%,d", total);
        System.out.println("총 금액: " + str + "원");

    }
}
