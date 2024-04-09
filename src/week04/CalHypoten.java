package week04;
import java.util.Scanner;

public class CalHypoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("밑변의 길이 : "); double base = sc.nextDouble();
        System.out.print("높이의 길이 : "); double height = sc.nextDouble();
        double c = Math.sqrt(base*base+height*height);
        System.out.println("빗변의 길이 : " + c);
        sc.close();
    }
}
