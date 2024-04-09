package week05;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = "cat1004";
        System.out.print("암호를 입력하세요: "); String Answer = sc.nextLine();
        Boolean Flag = true;
        int flag = 0;
        while (Flag) {
            if (Answer.equals(key)) {
                System.out.println("환영합니다!"); Flag = false;
            } else if (flag < 2) {
                System.out.println("암호가 틀립니다!"); flag++;
                System.out.print("암호를 입력하세요: "); Answer = sc.nextLine();
            } else {
                System.out.println("접속을 거부합니다!"); Flag = false;
            }
        }
        sc.close();
    }
}
