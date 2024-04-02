package week05;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: "); String str = sc.nextLine();
        int leng = str.length();
        int str_e = 0;
        for (int i=0; i<leng; i++) {
            if (str.charAt(i) == 'e') str_e++;
        }
        System.out.println("문자 e의 개수: " + str_e);
        sc.close();
    }
}
