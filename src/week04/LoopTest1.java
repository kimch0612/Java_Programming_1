package week04;
import java.util.Scanner;

public class LoopTest1 {
    public static void main(String[] args) {
        int i = 6;
        // while (--i>=1) {
        //     System.out.println(i);
        // }
        
        // for (i=1; i<=5; i++)
        //     System.out.println(i);

        // for (char a='A'; a<='Z'; a++)
        //     System.out.println(a);
        Scanner sc = new Scanner(System.in);
        i = 0;
        do {
            System.out.print("정수 두개 입력 ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("두 수의 합은 " + (a+b));
            i++;
        }while(i<3);
        sc.close();
    }
}
