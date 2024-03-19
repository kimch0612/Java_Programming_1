package week03;
import java.util.Scanner;

public class CalCircle {
    public static void main(String[] args) {
        final double PI = 3.14;
        double area, circle;
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름?:  "); int r = sc.nextInt();
        System.out.println("--------------------");
        area = PI * (float)r * (float)r;
        circle = 2 * PI * (float)r;
        System.out.println("면적: " + String.format("%.2f", area));
        System.out.println("둘레: " + String.format("%.2f", circle));
    }
}
