package week04;
import java.util.Scanner;

public class FindMax {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("세 개의 정수를 입력하세요");
        String number = sc.nextLine();
        String[] numb = number.split(" ");
        int max = 0;
        for (int i=0; i<=2; i++)
            if (max < Integer.parseInt(numb[i]))
                max = Integer.parseInt(numb[i]);
        System.out.println("최대값 : " + max);
        sc.close();
    }
}
