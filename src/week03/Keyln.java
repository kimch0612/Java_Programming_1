package week03;
import java.util.Scanner;

public class Keyln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요");
        String name = sc.next(); // 문자열 입력받음
        int age = sc.nextInt(); // 키보드로 정수를 입력받음
        System.out.println("이름: " + name + " / 나이: " + age);
        sc.close();
    }
}
