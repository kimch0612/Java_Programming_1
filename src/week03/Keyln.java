package week03;
import java.util.Scanner;

public class Keyln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요");
        String name = sc.next(); // 문자열 입력받음
        int age = sc.nextInt(); // 키보드로 정수를 입력받음
        System.out.println("이름: " + name + " / 나이: " + age);
        sc.nextLine(); // 엔터키가 입력되기 전까지 공백을 포함해서 입력받음
        System.out.println("나는 학생이다를 영어로~");
        System.out.println(sc.nextLine());
        sc.close();
    }
}
